package common.domain

import common.models.Food
import io.sphere.sdk.carts.{LineItem => SphereLineItem}
import io.sphere.sdk.models.LocalizedStrings
import io.sphere.sdk.orders.{ProductVariantImportDraftBuilder, LineItemImportDraftBuilder, LineItemImportDraft}
import io.sphere.sdk.products.Price
import java.util.Locale
import javax.money.MonetaryCurrencies

case class LineItem(food: Food, quantity: Int) {

  def toImportDraft: LineItemImportDraft = {
    LineItemImportDraftBuilder.of(
      ProductVariantImportDraftBuilder.of(food.id, 1).build(),
      quantity,
      Price.of(new java.math.BigDecimal(total()), MonetaryCurrencies.getCurrency("EUR")),
      LocalizedStrings.of(Locale.US, food.name)
    ).build()
  }

  def total() = quantity * food.price

}

object LineItem {

  def fromSphereLineItem(s : SphereLineItem): Option[LineItem] = {
    try {
      Some(LineItem(
        Food(s.getId, s.getName.get(Locale.US).get, s.getPrice.getValue.getNumber.doubleValue()),
        s.getQuantity.toInt
      ))
    } catch { case e: Exception => None }
  }

}

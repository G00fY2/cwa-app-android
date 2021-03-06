package de.rki.coronawarnapp.contactdiary.ui.overview.adapter.day.riskenf

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import de.rki.coronawarnapp.contactdiary.ui.overview.adapter.day.DayDataItem
import java.util.Objects

data class RiskEnfItem(
    @StringRes val title: Int,
    @StringRes val body: Int,
    @StringRes val bodyExtended: Int? = null,
    @DrawableRes val drawableId: Int
) : DayDataItem {
    override val stableId: Long = Objects.hash(title, body, bodyExtended, drawableId).toLong()
}

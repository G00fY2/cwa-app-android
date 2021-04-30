package de.rki.coronawarnapp.vaccination.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.rki.coronawarnapp.vaccination.ui.details.VaccinationDetailsFragment
import de.rki.coronawarnapp.vaccination.ui.details.VaccinationDetailsFragmentModule

@Module
abstract class VaccinationUIModule {
    @ContributesAndroidInjector(modules = [VaccinationDetailsFragmentModule::class])
    abstract fun vaccinationDetailsFragment(): VaccinationDetailsFragment
}

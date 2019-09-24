package id.ina.barbershop.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Galeriku(
    @PrimaryKey(autoGenerate = true)
    val ImageView: String,
    val TextView1: String,
    val TextView2: String
)


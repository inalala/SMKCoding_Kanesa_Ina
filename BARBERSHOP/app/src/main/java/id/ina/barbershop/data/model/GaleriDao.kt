package id.ina.barbershop.data.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.ina.barbershop.Galeri

@Dao
interface MyFriendDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun tambahTeman(friend: Galeriku)

    @Query("SELECT * FROM Galeri")
    fun ambilSemuaTeman(): LiveData<List<Galeri>>

}
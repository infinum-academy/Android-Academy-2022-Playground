package infinum.academy.android

import android.content.Context
import androidx.room.RoomDatabase

//TODO: Define database
abstract class SuperheroesDatabase : RoomDatabase() {

    companion object {

        @Volatile
        private var INSTANCE: SuperheroesDatabase? = null

        fun getDatabase(context: Context): SuperheroesDatabase? {
            return INSTANCE ?: synchronized(this) {
                //TODO: instantiate database
                null
            }
        }
    }

    //TODO: define DAO
}
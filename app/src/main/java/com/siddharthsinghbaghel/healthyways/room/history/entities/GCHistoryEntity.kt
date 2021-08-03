package com.siddharthsinghbaghel.healthyways.room.history.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "GCCalcHistory")
data class GCHistoryEntity(@ColumnInfo(name = "Current Weight") var currWeight: String,
                           @ColumnInfo(name = "Target Weight") var targetWeight: String,
                           @ColumnInfo(name = "TEE") var teeValue: String,
                           @ColumnInfo(name = "Weeks") var weekValue: String,
                           @ColumnInfo(name = "GC DateTime") var gcDateT: String,
                           @ColumnInfo(name = "Per day Calorie") var perDayCal: String,
                           @ColumnInfo(name = "Calorie Surplus") var surplusValue: String)
{
    @PrimaryKey(autoGenerate = true) var id = 0
}

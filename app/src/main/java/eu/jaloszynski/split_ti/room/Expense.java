package eu.jaloszynski.split_ti.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense_table")
public class Expense {

    @ColumnInfo(name = "word")
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;
    @NonNull
    private String Name;
    @NonNull
    private String Expense;
    @NonNull
    private String Value;

    public Expense(@NonNull String name, @NonNull String expense,@NonNull String value) {
        this.Name = name;
        this.Expense = expense;
        this.Value = value;
    }

    public String getName() {
        return Name;
    }

    public String getExpense() {
        return Expense;
    }

    public String getValue() {
        return Value;
    }

}

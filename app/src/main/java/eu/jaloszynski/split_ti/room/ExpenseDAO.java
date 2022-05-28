package eu.jaloszynski.split_ti.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ExpenseDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Expense expense);

    @Query("DELETE FROM expense_table")
    void deleteAll();

    @Query("SELECT * FROM expense_table ORDER BY Name ASC")
    List<Expense> getAlphabetizedExpensesName();

}
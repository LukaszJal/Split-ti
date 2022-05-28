package eu.jaloszynski.split_ti.room;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ExpenseRepository {

    private ExpenseDAO mExpenseDAO;
    private LiveData<List<Expense>> mAllExpense;

    ExpenseRepository(Application application) {
        ExpensesRoomDatabase db = ExpensesRoomDatabase.getDatabase(application);
        mExpenseDAO = db.expenseDAO();
        mAllExpense = (LiveData<List<Expense>>) mExpenseDAO.getAlphabetizedExpensesName();
    }
    LiveData<List<Expense>> getAllWords() {
        return mAllExpense;
    }

    void insert(Expense expense) {
        ExpensesRoomDatabase.databaseWriteExecutor.execute(() -> {
            mExpenseDAO.insert(expense);
        });
    }

}
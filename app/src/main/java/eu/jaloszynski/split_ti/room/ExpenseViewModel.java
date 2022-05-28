package eu.jaloszynski.split_ti.room;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ExpenseViewModel extends AndroidViewModel {

    private ExpenseRepository mRepository;

    private final LiveData<List<Expense>> mAllExpense;

    public ExpenseViewModel (Application application) {
        super(application);
        mRepository = new ExpenseRepository(application);
        mAllExpense = mRepository.getAllWords();
    }

    LiveData<List<Expense>> getAllWords() { return mAllExpense; }

    public void insert(Expense expense) { mRepository.insert(expense); }
}



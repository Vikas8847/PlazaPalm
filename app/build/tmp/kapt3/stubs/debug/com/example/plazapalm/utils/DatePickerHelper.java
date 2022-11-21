package com.example.plazapalm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010J(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/plazapalm/utils/DatePickerHelper;", "", "context", "Landroid/content/Context;", "isSpinnerType", "", "(Landroid/content/Context;Z)V", "callback", "Lcom/example/plazapalm/utils/DatePickerHelper$Callback;", "dialog", "Landroid/app/DatePickerDialog;", "listener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "setMaxDate", "", "maxDate", "", "setMinDate", "minDate", "showDialog", "dayofMonth", "", "month", "year", "Callback", "app_debug"})
public final class DatePickerHelper {
    private android.app.DatePickerDialog dialog;
    private com.example.plazapalm.utils.DatePickerHelper.Callback callback;
    private final android.app.DatePickerDialog.OnDateSetListener listener = null;
    
    public DatePickerHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isSpinnerType) {
        super();
    }
    
    public final void showDialog(int dayofMonth, int month, int year, @org.jetbrains.annotations.Nullable()
    com.example.plazapalm.utils.DatePickerHelper.Callback callback) {
    }
    
    public final void setMinDate(long minDate) {
    }
    
    public final void setMaxDate(long maxDate) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/example/plazapalm/utils/DatePickerHelper$Callback;", "", "onDateSelected", "", "dayofMonth", "", "month", "year", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onDateSelected(int dayofMonth, int month, int year);
    }
}
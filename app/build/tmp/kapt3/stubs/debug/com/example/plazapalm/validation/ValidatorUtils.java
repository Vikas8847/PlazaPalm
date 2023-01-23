package com.example.plazapalm.validation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n\u00a8\u0006\u000f"}, d2 = {"Lcom/example/plazapalm/validation/ValidatorUtils;", "", "()V", "hideSoftKeyboard", "", "activity", "Landroid/app/Activity;", "isEmailValid", "", "string", "", "isMobileValid", "isTextOnly", "validPassword", "password", "app_debug"})
public final class ValidatorUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.validation.ValidatorUtils INSTANCE = null;
    
    private ValidatorUtils() {
        super();
    }
    
    /**
     * PasswordValidator
     */
    public final boolean validPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    /**
     * EmailValidator
     */
    public final boolean isEmailValid(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    /**
     * MobileValidator
     */
    public final boolean isMobileValid(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    public final boolean isTextOnly(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    public final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}
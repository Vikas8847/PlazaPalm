package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SignupFragmentBindingImpl extends SignupFragmentBinding implements com.example.plazapalm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gLineSignup, 10);
        sViewsWithIds.put(R.id.tvSignup, 11);
        sViewsWithIds.put(R.id.nScrollSigUp, 12);
        sViewsWithIds.put(R.id.clSignup, 13);
        sViewsWithIds.put(R.id.tvSignupFirstName, 14);
        sViewsWithIds.put(R.id.tvSignupLastName, 15);
        sViewsWithIds.put(R.id.clSignupFirstName, 16);
        sViewsWithIds.put(R.id.clSignupLastName, 17);
        sViewsWithIds.put(R.id.tvSignupEmail, 18);
        sViewsWithIds.put(R.id.clSignupEmail, 19);
        sViewsWithIds.put(R.id.tvSignupPassword, 20);
        sViewsWithIds.put(R.id.tlSignupPass, 21);
        sViewsWithIds.put(R.id.tvSignupConfirmPass, 22);
        sViewsWithIds.put(R.id.tlSignupConfirmPass, 23);
        sViewsWithIds.put(R.id.tvSignupBusiness, 24);
        sViewsWithIds.put(R.id.radioGroup, 25);
        sViewsWithIds.put(R.id.gLineSignUpWantLogin, 26);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etSignupConfirmPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.confirmPassword.get()
            //         is vm.confirmPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSignupConfirmPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.signup.SignupVM vm = mVm;
            // vm.confirmPassword.get()
            java.lang.String vmConfirmPasswordGet = null;
            // vm.confirmPassword != null
            boolean vmConfirmPasswordJavaLangObjectNull = false;
            // vm.confirmPassword
            androidx.databinding.ObservableField<java.lang.String> vmConfirmPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmConfirmPassword = vm.getConfirmPassword();

                vmConfirmPasswordJavaLangObjectNull = (vmConfirmPassword) != (null);
                if (vmConfirmPasswordJavaLangObjectNull) {




                    vmConfirmPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etSignupEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.email.get()
            //         is vm.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSignupEmail);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.signup.SignupVM vm = mVm;
            // vm.email.get()
            java.lang.String vmEmailGet = null;
            // vm.email != null
            boolean vmEmailJavaLangObjectNull = false;
            // vm.email
            androidx.databinding.ObservableField<java.lang.String> vmEmail = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmEmail = vm.getEmail();

                vmEmailJavaLangObjectNull = (vmEmail) != (null);
                if (vmEmailJavaLangObjectNull) {




                    vmEmail.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etSignupFirstNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.firstName.get()
            //         is vm.firstName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSignupFirstName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.signup.SignupVM vm = mVm;
            // vm.firstName != null
            boolean vmFirstNameJavaLangObjectNull = false;
            // vm.firstName
            androidx.databinding.ObservableField<java.lang.String> vmFirstName = null;
            // vm.firstName.get()
            java.lang.String vmFirstNameGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmFirstName = vm.getFirstName();

                vmFirstNameJavaLangObjectNull = (vmFirstName) != (null);
                if (vmFirstNameJavaLangObjectNull) {




                    vmFirstName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etSignupLastNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.lastName.get()
            //         is vm.lastName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSignupLastName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.signup.SignupVM vm = mVm;
            // vm.lastName
            androidx.databinding.ObservableField<java.lang.String> vmLastName = null;
            // vm.lastName.get()
            java.lang.String vmLastNameGet = null;
            // vm.lastName != null
            boolean vmLastNameJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmLastName = vm.getLastName();

                vmLastNameJavaLangObjectNull = (vmLastName) != (null);
                if (vmLastNameJavaLangObjectNull) {




                    vmLastName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etSignupPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.password.get()
            //         is vm.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSignupPassword);
            // localize variables for thread safety
            // vm.password.get()
            java.lang.String vmPasswordGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.signup.SignupVM vm = mVm;
            // vm.password != null
            boolean vmPasswordJavaLangObjectNull = false;
            // vm.password
            androidx.databinding.ObservableField<java.lang.String> vmPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPassword = vm.getPassword();

                vmPasswordJavaLangObjectNull = (vmPassword) != (null);
                if (vmPasswordJavaLangObjectNull) {




                    vmPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public SignupFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private SignupFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[26]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (android.widget.RadioGroup) bindings[25]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[21]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[24]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            );
        this.btnSignup.setTag(null);
        this.clsignupMain.setTag(null);
        this.etSignupConfirmPassword.setTag(null);
        this.etSignupEmail.setTag(null);
        this.etSignupFirstName.setTag(null);
        this.etSignupLastName.setTag(null);
        this.etSignupPassword.setTag(null);
        this.rbNo.setTag(null);
        this.rbYes.setTag(null);
        this.tvSignupWantLogin.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.plazapalm.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.example.plazapalm.views.signup.SignupVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.signup.SignupVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmFirstName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmConfirmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmLastName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmEmail((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmFirstName(androidx.databinding.ObservableField<java.lang.String> VmFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmConfirmPassword(androidx.databinding.ObservableField<java.lang.String> VmConfirmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPassword(androidx.databinding.ObservableField<java.lang.String> VmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLastName(androidx.databinding.ObservableField<java.lang.String> VmLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmEmail(androidx.databinding.ObservableField<java.lang.String> VmEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String vmPasswordGet = null;
        com.example.plazapalm.views.signup.SignupVM vm = mVm;
        java.lang.String vmEmailGet = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> vmFirstName = null;
        java.lang.String vmFirstNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmConfirmPassword = null;
        java.lang.String vmConfirmPasswordGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPassword = null;
        androidx.databinding.ObservableField<java.lang.String> vmLastName = null;
        java.lang.String vmLastNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmEmail = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x60L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (vm != null) {
                        // read vm.firstName
                        vmFirstName = vm.getFirstName();
                    }
                    updateRegistration(0, vmFirstName);


                    if (vmFirstName != null) {
                        // read vm.firstName.get()
                        vmFirstNameGet = vmFirstName.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (vm != null) {
                        // read vm.confirmPassword
                        vmConfirmPassword = vm.getConfirmPassword();
                    }
                    updateRegistration(1, vmConfirmPassword);


                    if (vmConfirmPassword != null) {
                        // read vm.confirmPassword.get()
                        vmConfirmPasswordGet = vmConfirmPassword.get();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (vm != null) {
                        // read vm.password
                        vmPassword = vm.getPassword();
                    }
                    updateRegistration(2, vmPassword);


                    if (vmPassword != null) {
                        // read vm.password.get()
                        vmPasswordGet = vmPassword.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (vm != null) {
                        // read vm.lastName
                        vmLastName = vm.getLastName();
                    }
                    updateRegistration(3, vmLastName);


                    if (vmLastName != null) {
                        // read vm.lastName.get()
                        vmLastNameGet = vmLastName.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (vm != null) {
                        // read vm.email
                        vmEmail = vm.getEmail();
                    }
                    updateRegistration(4, vmEmail);


                    if (vmEmail != null) {
                        // read vm.email.get()
                        vmEmailGet = vmEmail.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.btnSignup.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clsignupMain.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSignupWantLogin.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSignupConfirmPassword, vmConfirmPasswordGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSignupConfirmPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSignupConfirmPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSignupEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSignupEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSignupFirstName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSignupFirstNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSignupLastName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSignupLastNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSignupPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSignupPasswordandroidTextAttrChanged);
            this.rbNo.setOnClickListener(mCallback7);
            this.rbYes.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSignupEmail, vmEmailGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSignupFirstName, vmFirstNameGet);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSignupLastName, vmLastNameGet);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSignupPassword, vmPasswordGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.signup.SignupVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.signup.SignupVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClicks(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.example.plazapalm.views.signup.SignupVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.selectOption(radioGroup, callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.example.plazapalm.views.signup.SignupVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.selectOption(radioGroup, callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.firstName
        flag 1 (0x2L): vm.confirmPassword
        flag 2 (0x3L): vm.password
        flag 3 (0x4L): vm.lastName
        flag 4 (0x5L): vm.email
        flag 5 (0x6L): vm
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}
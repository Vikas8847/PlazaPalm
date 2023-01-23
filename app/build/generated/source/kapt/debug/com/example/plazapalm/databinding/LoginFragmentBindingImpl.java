package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoginFragmentBindingImpl extends LoginFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline9, 8);
        sViewsWithIds.put(R.id.tvLogin, 9);
        sViewsWithIds.put(R.id.nScrollLogin, 10);
        sViewsWithIds.put(R.id.tvLoginEmail, 11);
        sViewsWithIds.put(R.id.clLoginEmail, 12);
        sViewsWithIds.put(R.id.tvLoginPassword, 13);
        sViewsWithIds.put(R.id.tlLoginPassword, 14);
        sViewsWithIds.put(R.id.gLineLoginWantSignup, 15);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView1;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etLoginPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.password.get()
            //         is vm.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etLoginPassword);
            // localize variables for thread safety
            // vm.password.get()
            java.lang.String vmPasswordGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.login.LoginVM vm = mVm;
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
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.email.get()
            //         is vm.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.login.LoginVM vm = mVm;
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

    public LoginFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private LoginFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            );
        this.btnConfirmBooking.setTag(null);
        this.btnLogin.setTag(null);
        this.btnLoginCategories.setTag(null);
        this.clMainLogin.setTag(null);
        this.etLoginPassword.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.tvLoginForgotPass.setTag(null);
        this.tvLoginWantSignup.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setVm((com.example.plazapalm.views.login.LoginVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.login.LoginVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmEmail((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmPassword(androidx.databinding.ObservableField<java.lang.String> VmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmEmail(androidx.databinding.ObservableField<java.lang.String> VmEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.example.plazapalm.views.login.LoginVM vm = mVm;
        java.lang.String vmEmailGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPassword = null;
        android.view.View.OnClickListener vmClicksAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> vmEmail = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.password
                        vmPassword = vm.getPassword();
                    }
                    updateRegistration(0, vmPassword);


                    if (vmPassword != null) {
                        // read vm.password.get()
                        vmPasswordGet = vmPassword.get();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (vm != null) {
                        // read vm::clicks
                        vmClicksAndroidViewViewOnClickListener = (((mVmClicksAndroidViewViewOnClickListener == null) ? (mVmClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.email
                        vmEmail = vm.getEmail();
                    }
                    updateRegistration(1, vmEmail);


                    if (vmEmail != null) {
                        // read vm.email.get()
                        vmEmailGet = vmEmail.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btnConfirmBooking.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
            this.btnLogin.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
            this.btnLoginCategories.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
            this.clMainLogin.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
            this.tvLoginForgotPass.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
            this.tvLoginWantSignup.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etLoginPassword, vmPasswordGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etLoginPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etLoginPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, vmEmailGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.login.LoginVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.login.LoginVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clicks(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.password
        flag 1 (0x2L): vm.email
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
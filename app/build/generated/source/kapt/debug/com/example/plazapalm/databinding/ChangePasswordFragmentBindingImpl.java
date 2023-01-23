package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChangePasswordFragmentBindingImpl extends ChangePasswordFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvChangePassword, 7);
        sViewsWithIds.put(R.id.tvSettingsChangePassword, 8);
        sViewsWithIds.put(R.id.clCurrentPass, 9);
        sViewsWithIds.put(R.id.tvChangeNewPass, 10);
        sViewsWithIds.put(R.id.clNewPass, 11);
        sViewsWithIds.put(R.id.tvConfirmPass, 12);
        sViewsWithIds.put(R.id.clConfirmPass, 13);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etChangePassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.currentPassword.get()
            //         is vm.currentPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etChangePass);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.changepass.ChangePassVM vm = mVm;
            // vm.currentPassword
            androidx.databinding.ObservableField<java.lang.String> vmCurrentPassword = null;
            // vm.currentPassword != null
            boolean vmCurrentPasswordJavaLangObjectNull = false;
            // vm.currentPassword.get()
            java.lang.String vmCurrentPasswordGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmCurrentPassword = vm.getCurrentPassword();

                vmCurrentPasswordJavaLangObjectNull = (vmCurrentPassword) != (null);
                if (vmCurrentPasswordJavaLangObjectNull) {




                    vmCurrentPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etConfirmPassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.confirmPassword.get()
            //         is vm.confirmPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etConfirmPass);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.changepass.ChangePassVM vm = mVm;
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
    private androidx.databinding.InverseBindingListener etNewPassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.newPassword.get()
            //         is vm.newPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNewPass);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.changepass.ChangePassVM vm = mVm;
            // vm.newPassword.get()
            java.lang.String vmNewPasswordGet = null;
            // vm.newPassword != null
            boolean vmNewPasswordJavaLangObjectNull = false;
            // vm.newPassword
            androidx.databinding.ObservableField<java.lang.String> vmNewPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmNewPassword = vm.getNewPassword();

                vmNewPasswordJavaLangObjectNull = (vmNewPassword) != (null);
                if (vmNewPasswordJavaLangObjectNull) {




                    vmNewPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ChangePasswordFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ChangePasswordFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.btnChangePassword.setTag(null);
        this.clChangePassMain.setTag(null);
        this.etChangePass.setTag(null);
        this.etConfirmPass.setTag(null);
        this.etNewPass.setTag(null);
        this.ivChangePassword.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setVm((com.example.plazapalm.views.changepass.ChangePassVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.changepass.ChangePassVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmNewPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmConfirmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmCurrentPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmNewPassword(androidx.databinding.ObservableField<java.lang.String> VmNewPassword, int fieldId) {
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
    private boolean onChangeVmCurrentPassword(androidx.databinding.ObservableField<java.lang.String> VmCurrentPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.databinding.ObservableField<java.lang.String> vmNewPassword = null;
        androidx.databinding.ObservableField<java.lang.String> vmConfirmPassword = null;
        com.example.plazapalm.views.changepass.ChangePassVM vm = mVm;
        java.lang.String vmConfirmPasswordGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmCurrentPassword = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        java.lang.String vmNewPasswordGet = null;
        java.lang.String vmCurrentPasswordGet = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (vm != null) {
                        // read vm.newPassword
                        vmNewPassword = vm.getNewPassword();
                    }
                    updateRegistration(0, vmNewPassword);


                    if (vmNewPassword != null) {
                        // read vm.newPassword.get()
                        vmNewPasswordGet = vmNewPassword.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

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
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (vm != null) {
                        // read vm.currentPassword
                        vmCurrentPassword = vm.getCurrentPassword();
                    }
                    updateRegistration(2, vmCurrentPassword);


                    if (vmCurrentPassword != null) {
                        // read vm.currentPassword.get()
                        vmCurrentPasswordGet = vmCurrentPassword.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.btnChangePassword.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clChangePassMain.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivChangePassword.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etChangePass, vmCurrentPasswordGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etChangePass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etChangePassandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmPass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmPassandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNewPass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNewPassandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmPass, vmConfirmPasswordGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNewPass, vmNewPasswordGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.changepass.ChangePassVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.changepass.ChangePassVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClicks(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.newPassword
        flag 1 (0x2L): vm.confirmPassword
        flag 2 (0x3L): vm.currentPassword
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}
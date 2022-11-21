package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditProfileFragmentBindingImpl extends EditProfileFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvEditProfile, 8);
        sViewsWithIds.put(R.id.ivSettingBtn, 9);
        sViewsWithIds.put(R.id.gLineEditProfile, 10);
        sViewsWithIds.put(R.id.profile_image, 11);
        sViewsWithIds.put(R.id.ivEditProfileCamera, 12);
        sViewsWithIds.put(R.id.gLineEditProfileJi, 13);
        sViewsWithIds.put(R.id.tvEditFirstName, 14);
        sViewsWithIds.put(R.id.clEditProfile, 15);
        sViewsWithIds.put(R.id.tvEditLastName, 16);
        sViewsWithIds.put(R.id.clEditLastName, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView6;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.firstName.get()
            //         is vm.firstName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.editprofile.EditProfileVM vm = mVm;
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
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.lastName.get()
            //         is vm.lastName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.editprofile.EditProfileVM vm = mVm;
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

    public EditProfileFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private EditProfileFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.clEditProfileCircular.setTag(null);
        this.clEditProfileMain.setTag(null);
        this.ivEditProfile.setTag(null);
        this.ivEditProfileBackBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.tvBtnUpdateProfile.setTag(null);
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
            setVm((com.example.plazapalm.views.editprofile.EditProfileVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.editprofile.EditProfileVM Vm) {
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
                return onChangeVmLastName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmProfilePic((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmFirstName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmLastName(androidx.databinding.ObservableField<java.lang.String> VmLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmProfilePic(androidx.databinding.ObservableField<java.lang.String> VmProfilePic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFirstName(androidx.databinding.ObservableField<java.lang.String> VmFirstName, int fieldId) {
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
        java.lang.String vmProfilePicGet = null;
        java.lang.String vmFirstNameGet = null;
        com.example.plazapalm.views.editprofile.EditProfileVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmLastName = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        java.lang.String vmLastNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmProfilePic = null;
        androidx.databinding.ObservableField<java.lang.String> vmFirstName = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (vm != null) {
                        // read vm.lastName
                        vmLastName = vm.getLastName();
                    }
                    updateRegistration(0, vmLastName);


                    if (vmLastName != null) {
                        // read vm.lastName.get()
                        vmLastNameGet = vmLastName.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (vm != null) {
                        // read vm.profile_pic
                        vmProfilePic = vm.getProfile_pic();
                    }
                    updateRegistration(1, vmProfilePic);


                    if (vmProfilePic != null) {
                        // read vm.profile_pic.get()
                        vmProfilePicGet = vmProfilePic.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (vm != null) {
                        // read vm.firstName
                        vmFirstName = vm.getFirstName();
                    }
                    updateRegistration(2, vmFirstName);


                    if (vmFirstName != null) {
                        // read vm.firstName.get()
                        vmFirstNameGet = vmFirstName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.clEditProfileCircular.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clEditProfileMain.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivEditProfileBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvBtnUpdateProfile.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setCircleImage(this.ivEditProfile, vmProfilePicGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, vmFirstNameGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, vmLastNameGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.editprofile.EditProfileVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.editprofile.EditProfileVM value) {
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
        flag 0 (0x1L): vm.lastName
        flag 1 (0x2L): vm.profile_pic
        flag 2 (0x3L): vm.firstName
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}
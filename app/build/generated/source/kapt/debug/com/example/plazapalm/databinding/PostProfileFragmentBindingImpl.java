package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PostProfileFragmentBindingImpl extends PostProfileFragmentBinding implements com.example.plazapalm.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvViewEditMyProfile, 17);
        sViewsWithIds.put(R.id.clSecond, 18);
        sViewsWithIds.put(R.id.scrollEditViewProfile, 19);
        sViewsWithIds.put(R.id.clEditProAllViewsHolder, 20);
        sViewsWithIds.put(R.id.gLineAddImages, 21);
        sViewsWithIds.put(R.id.tvViewEditProfileAdd, 22);
        sViewsWithIds.put(R.id.rvViewEditAddImages, 23);
        sViewsWithIds.put(R.id.tvVEditProFirstName, 24);
        sViewsWithIds.put(R.id.tvVEditProLastName, 25);
        sViewsWithIds.put(R.id.tvVEditProUserName, 26);
        sViewsWithIds.put(R.id.tvVEditProTitle, 27);
        sViewsWithIds.put(R.id.tvVEditProChooseCategory, 28);
        sViewsWithIds.put(R.id.tvVEditProAddAddress, 29);
        sViewsWithIds.put(R.id.tvVEditProTags, 30);
        sViewsWithIds.put(R.id.tvVEditProDescription, 31);
        sViewsWithIds.put(R.id.tvVEditProDescriptionSecond, 32);
        sViewsWithIds.put(R.id.tvVEditProDescriptionThird, 33);
        sViewsWithIds.put(R.id.tvVEditProExpiryDate, 34);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback7;
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener btnUpdateEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.postdata.get()
            //         is vm.postdata.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(btnUpdateEmail);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.postdata
            androidx.databinding.ObservableField<java.lang.String> vmPostdata = null;
            // vm.postdata.get()
            java.lang.String vmPostdataGet = null;
            // vm.postdata != null
            boolean vmPostdataJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPostdata = vm.getPostdata();

                vmPostdataJavaLangObjectNull = (vmPostdata) != (null);
                if (vmPostdataJavaLangObjectNull) {




                    vmPostdata.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProAddAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.address.get()
            //         is vm.address.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProAddAddress);
            // localize variables for thread safety
            // vm.address
            androidx.databinding.ObservableField<java.lang.String> vmAddress = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.address != null
            boolean vmAddressJavaLangObjectNull = false;
            // vm.address.get()
            java.lang.String vmAddressGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmAddress = vm.getAddress();

                vmAddressJavaLangObjectNull = (vmAddress) != (null);
                if (vmAddressJavaLangObjectNull) {




                    vmAddress.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProChooseCategoryandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.categeory.get()
            //         is vm.categeory.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProChooseCategory);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.categeory.get()
            java.lang.String vmCategeoryGet = null;
            // vm.categeory
            androidx.databinding.ObservableField<java.lang.String> vmCategeory = null;
            // vm.categeory != null
            boolean vmCategeoryJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmCategeory = vm.getCategeory();

                vmCategeoryJavaLangObjectNull = (vmCategeory) != (null);
                if (vmCategeoryJavaLangObjectNull) {




                    vmCategeory.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.description1.get()
            //         is vm.description1.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProDescription);
            // localize variables for thread safety
            // vm.description1
            androidx.databinding.ObservableField<java.lang.String> vmDescription1 = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.description1 != null
            boolean vmDescription1JavaLangObjectNull = false;
            // vm.description1.get()
            java.lang.String vmDescription1Get = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDescription1 = vm.getDescription1();

                vmDescription1JavaLangObjectNull = (vmDescription1) != (null);
                if (vmDescription1JavaLangObjectNull) {




                    vmDescription1.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProDescriptionSecondandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.description2.get()
            //         is vm.description2.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProDescriptionSecond);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.description2
            androidx.databinding.ObservableField<java.lang.String> vmDescription2 = null;
            // vm.description2 != null
            boolean vmDescription2JavaLangObjectNull = false;
            // vm.description2.get()
            java.lang.String vmDescription2Get = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDescription2 = vm.getDescription2();

                vmDescription2JavaLangObjectNull = (vmDescription2) != (null);
                if (vmDescription2JavaLangObjectNull) {




                    vmDescription2.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProDescriptionThirdandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.description3.get()
            //         is vm.description3.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProDescriptionThird);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.description3 != null
            boolean vmDescription3JavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.description3
            androidx.databinding.ObservableField<java.lang.String> vmDescription3 = null;
            // vm.description3.get()
            java.lang.String vmDescription3Get = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDescription3 = vm.getDescription3();

                vmDescription3JavaLangObjectNull = (vmDescription3) != (null);
                if (vmDescription3JavaLangObjectNull) {




                    vmDescription3.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProExpiryDateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.expireDate.get()
            //         is vm.expireDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProExpiryDate);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.expireDate != null
            boolean vmExpireDateJavaLangObjectNull = false;
            // vm.expireDate
            androidx.databinding.ObservableField<java.lang.String> vmExpireDate = null;
            // vm.expireDate.get()
            java.lang.String vmExpireDateGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmExpireDate = vm.getExpireDate();

                vmExpireDateJavaLangObjectNull = (vmExpireDate) != (null);
                if (vmExpireDateJavaLangObjectNull) {




                    vmExpireDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProFirstNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.firstName.get()
            //         is vm.firstName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProFirstName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
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
    private androidx.databinding.InverseBindingListener etVEditProLastNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.lastName.get()
            //         is vm.lastName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProLastName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
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
    private androidx.databinding.InverseBindingListener etVEditProTagsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.location.get()
            //         is vm.location.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProTags);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.location.get()
            java.lang.String vmLocationGet = null;
            // vm.location
            androidx.databinding.ObservableField<java.lang.String> vmLocation = null;
            // vm.location != null
            boolean vmLocationJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmLocation = vm.getLocation();

                vmLocationJavaLangObjectNull = (vmLocation) != (null);
                if (vmLocationJavaLangObjectNull) {




                    vmLocation.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProUserNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.userName.get()
            //         is vm.userName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProUserName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.userName
            androidx.databinding.ObservableField<java.lang.String> vmUserName = null;
            // vm.userName != null
            boolean vmUserNameJavaLangObjectNull = false;
            // vm.userName.get()
            java.lang.String vmUserNameGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUserName = vm.getUserName();

                vmUserNameJavaLangObjectNull = (vmUserName) != (null);
                if (vmUserNameJavaLangObjectNull) {




                    vmUserName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etVEditProfileTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.profileTitle.get()
            //         is vm.profileTitle.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etVEditProfileTitle);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.profileTitle.get()
            java.lang.String vmProfileTitleGet = null;
            // vm
            com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
            // vm.profileTitle
            androidx.databinding.ObservableField<java.lang.String> vmProfileTitle = null;
            // vm.profileTitle != null
            boolean vmProfileTitleJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmProfileTitle = vm.getProfileTitle();

                vmProfileTitleJavaLangObjectNull = (vmProfileTitle) != (null);
                if (vmProfileTitleJavaLangObjectNull) {




                    vmProfileTitle.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public PostProfileFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private PostProfileFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 12
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[12]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[13]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[7]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (androidx.core.widget.NestedScrollView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[29]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[28]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[31]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[33]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[34]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[24]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[25]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[27]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[22]
            );
        this.btnUpdateEmail.setTag(null);
        this.clViewEditProfileAdd.setTag(null);
        this.etVEditProAddAddress.setTag(null);
        this.etVEditProChooseCategory.setTag(null);
        this.etVEditProDescription.setTag(null);
        this.etVEditProDescriptionSecond.setTag(null);
        this.etVEditProDescriptionThird.setTag(null);
        this.etVEditProExpiryDate.setTag(null);
        this.etVEditProFirstName.setTag(null);
        this.etVEditProLastName.setTag(null);
        this.etVEditProTags.setTag(null);
        this.etVEditProUserName.setTag(null);
        this.etVEditProfileTitle.setTag(null);
        this.ivViewEditProfileAdd.setTag(null);
        this.ivViewEditProfileBackBtn.setTag(null);
        this.ivViewEditProfileDotsBtn.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.plazapalm.generated.callback.AfterTextChanged(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
            setVm((com.example.plazapalm.views.myprofile.postprofile.PostProfileVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.myprofile.postprofile.PostProfileVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmLocation((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmDescription1((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmDescription3((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmUserName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmFirstName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmPostdata((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeVmProfileTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeVmExpireDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeVmLastName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeVmCategeory((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeVmAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeVmDescription2((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmLocation(androidx.databinding.ObservableField<java.lang.String> VmLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDescription1(androidx.databinding.ObservableField<java.lang.String> VmDescription1, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDescription3(androidx.databinding.ObservableField<java.lang.String> VmDescription3, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUserName(androidx.databinding.ObservableField<java.lang.String> VmUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFirstName(androidx.databinding.ObservableField<java.lang.String> VmFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPostdata(androidx.databinding.ObservableField<java.lang.String> VmPostdata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmProfileTitle(androidx.databinding.ObservableField<java.lang.String> VmProfileTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmExpireDate(androidx.databinding.ObservableField<java.lang.String> VmExpireDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLastName(androidx.databinding.ObservableField<java.lang.String> VmLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCategeory(androidx.databinding.ObservableField<java.lang.String> VmCategeory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmAddress(androidx.databinding.ObservableField<java.lang.String> VmAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDescription2(androidx.databinding.ObservableField<java.lang.String> VmDescription2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
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
        java.lang.String vmDescription3Get = null;
        com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmLocation = null;
        java.lang.String vmAddressGet = null;
        java.lang.String vmExpireDateGet = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        java.lang.String vmDescription1Get = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription1 = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription3 = null;
        java.lang.String vmLocationGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmUserName = null;
        androidx.databinding.ObservableField<java.lang.String> vmFirstName = null;
        java.lang.String vmCategeoryGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPostdata = null;
        androidx.databinding.ObservableField<java.lang.String> vmProfileTitle = null;
        java.lang.String vmDescription2Get = null;
        java.lang.String vmProfileTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmExpireDate = null;
        java.lang.String vmFirstNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmLastName = null;
        java.lang.String vmPostdataGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmCategeory = null;
        java.lang.String vmLastNameGet = null;
        java.lang.String vmUserNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmAddress = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription2 = null;

        if ((dirtyFlags & 0x3fffL) != 0) {


            if ((dirtyFlags & 0x3001L) != 0) {

                    if (vm != null) {
                        // read vm.location
                        vmLocation = vm.getLocation();
                    }
                    updateRegistration(0, vmLocation);


                    if (vmLocation != null) {
                        // read vm.location.get()
                        vmLocationGet = vmLocation.get();
                    }
            }
            if ((dirtyFlags & 0x3000L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0x3002L) != 0) {

                    if (vm != null) {
                        // read vm.description1
                        vmDescription1 = vm.getDescription1();
                    }
                    updateRegistration(1, vmDescription1);


                    if (vmDescription1 != null) {
                        // read vm.description1.get()
                        vmDescription1Get = vmDescription1.get();
                    }
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (vm != null) {
                        // read vm.description3
                        vmDescription3 = vm.getDescription3();
                    }
                    updateRegistration(2, vmDescription3);


                    if (vmDescription3 != null) {
                        // read vm.description3.get()
                        vmDescription3Get = vmDescription3.get();
                    }
            }
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (vm != null) {
                        // read vm.userName
                        vmUserName = vm.getUserName();
                    }
                    updateRegistration(3, vmUserName);


                    if (vmUserName != null) {
                        // read vm.userName.get()
                        vmUserNameGet = vmUserName.get();
                    }
            }
            if ((dirtyFlags & 0x3010L) != 0) {

                    if (vm != null) {
                        // read vm.firstName
                        vmFirstName = vm.getFirstName();
                    }
                    updateRegistration(4, vmFirstName);


                    if (vmFirstName != null) {
                        // read vm.firstName.get()
                        vmFirstNameGet = vmFirstName.get();
                    }
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (vm != null) {
                        // read vm.postdata
                        vmPostdata = vm.getPostdata();
                    }
                    updateRegistration(5, vmPostdata);


                    if (vmPostdata != null) {
                        // read vm.postdata.get()
                        vmPostdataGet = vmPostdata.get();
                    }
            }
            if ((dirtyFlags & 0x3040L) != 0) {

                    if (vm != null) {
                        // read vm.profileTitle
                        vmProfileTitle = vm.getProfileTitle();
                    }
                    updateRegistration(6, vmProfileTitle);


                    if (vmProfileTitle != null) {
                        // read vm.profileTitle.get()
                        vmProfileTitleGet = vmProfileTitle.get();
                    }
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (vm != null) {
                        // read vm.expireDate
                        vmExpireDate = vm.getExpireDate();
                    }
                    updateRegistration(7, vmExpireDate);


                    if (vmExpireDate != null) {
                        // read vm.expireDate.get()
                        vmExpireDateGet = vmExpireDate.get();
                    }
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (vm != null) {
                        // read vm.lastName
                        vmLastName = vm.getLastName();
                    }
                    updateRegistration(8, vmLastName);


                    if (vmLastName != null) {
                        // read vm.lastName.get()
                        vmLastNameGet = vmLastName.get();
                    }
            }
            if ((dirtyFlags & 0x3200L) != 0) {

                    if (vm != null) {
                        // read vm.categeory
                        vmCategeory = vm.getCategeory();
                    }
                    updateRegistration(9, vmCategeory);


                    if (vmCategeory != null) {
                        // read vm.categeory.get()
                        vmCategeoryGet = vmCategeory.get();
                    }
            }
            if ((dirtyFlags & 0x3400L) != 0) {

                    if (vm != null) {
                        // read vm.address
                        vmAddress = vm.getAddress();
                    }
                    updateRegistration(10, vmAddress);


                    if (vmAddress != null) {
                        // read vm.address.get()
                        vmAddressGet = vmAddress.get();
                    }
            }
            if ((dirtyFlags & 0x3800L) != 0) {

                    if (vm != null) {
                        // read vm.description2
                        vmDescription2 = vm.getDescription2();
                    }
                    updateRegistration(11, vmDescription2);


                    if (vmDescription2 != null) {
                        // read vm.description2.get()
                        vmDescription2Get = vmDescription2.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            this.btnUpdateEmail.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clViewEditProfileAdd.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.etVEditProChooseCategory.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.etVEditProExpiryDate.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.etVEditProTags.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivViewEditProfileAdd.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivViewEditProfileBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivViewEditProfileDotsBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnUpdateEmail, vmPostdataGet);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.btnUpdateEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, btnUpdateEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProAddAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProAddAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProChooseCategory, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProChooseCategoryandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProDescriptionSecond, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProDescriptionSecondandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProDescriptionThird, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProDescriptionThirdandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProExpiryDate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProExpiryDateandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProFirstName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProFirstNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProLastName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProLastNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProTags, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProTagsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProUserName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback7, etVEditProUserNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVEditProfileTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVEditProfileTitleandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProAddAddress, vmAddressGet);
        }
        if ((dirtyFlags & 0x3200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProChooseCategory, vmCategeoryGet);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProDescription, vmDescription1Get);
        }
        if ((dirtyFlags & 0x3800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProDescriptionSecond, vmDescription2Get);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProDescriptionThird, vmDescription3Get);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProExpiryDate, vmExpireDateGet);
        }
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProFirstName, vmFirstNameGet);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProLastName, vmLastNameGet);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProTags, vmLocationGet);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProUserName, vmUserNameGet);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etVEditProfileTitle, vmProfileTitleGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.myprofile.postprofile.PostProfileVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.myprofile.postprofile.PostProfileVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClicks(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.example.plazapalm.views.myprofile.postprofile.PostProfileVM vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {



            vm.onTextChange(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.location
        flag 1 (0x2L): vm.description1
        flag 2 (0x3L): vm.description3
        flag 3 (0x4L): vm.userName
        flag 4 (0x5L): vm.firstName
        flag 5 (0x6L): vm.postdata
        flag 6 (0x7L): vm.profileTitle
        flag 7 (0x8L): vm.expireDate
        flag 8 (0x9L): vm.lastName
        flag 9 (0xaL): vm.categeory
        flag 10 (0xbL): vm.address
        flag 11 (0xcL): vm.description2
        flag 12 (0xdL): vm
        flag 13 (0xeL): null
    flag mapping end*/
    //end
}
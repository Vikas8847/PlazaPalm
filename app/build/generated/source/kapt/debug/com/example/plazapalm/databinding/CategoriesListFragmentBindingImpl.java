package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CategoriesListFragmentBindingImpl extends CategoriesListFragmentBinding implements com.example.plazapalm.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvCategories, 6);
        sViewsWithIds.put(R.id.clCategoriesListSearch, 7);
        sViewsWithIds.put(R.id.tvCategoriesLocationDes, 8);
        sViewsWithIds.put(R.id.ivCategoriesForward, 9);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView2;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback10;
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.searchItems.get()
            //         is vm.searchItems.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.catergorylist.CategoriesListVM vm = mVm;
            // vm.searchItems != null
            boolean vmSearchItemsJavaLangObjectNull = false;
            // vm.searchItems.get()
            java.lang.String vmSearchItemsGet = null;
            // vm.searchItems
            androidx.databinding.ObservableField<java.lang.String> vmSearchItems = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmSearchItems = vm.getSearchItems();

                vmSearchItemsJavaLangObjectNull = (vmSearchItems) != (null);
                if (vmSearchItemsJavaLangObjectNull) {




                    vmSearchItems.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvCategoriesLocationCitiesandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.address.get()
            //         is vm.address.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvCategoriesLocationCities);
            // localize variables for thread safety
            // vm.address
            androidx.databinding.ObservableField<java.lang.String> vmAddress = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.catergorylist.CategoriesListVM vm = mVm;
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

    public CategoriesListFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private CategoriesListFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.clMainCategory.setTag(null);
        this.clSearchLocation.setTag(null);
        this.ivCategory.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.rvCategoryLocation.setTag(null);
        this.tvCategoriesLocationCities.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.example.plazapalm.generated.callback.AfterTextChanged(this, 1);
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
            setVm((com.example.plazapalm.views.catergorylist.CategoriesListVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.catergorylist.CategoriesListVM Vm) {
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
                return onChangeVmAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmSearchItems((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmAddress(androidx.databinding.ObservableField<java.lang.String> VmAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmSearchItems(androidx.databinding.ObservableField<java.lang.String> VmSearchItems, int fieldId) {
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
        java.lang.String vmSearchItemsGet = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.CategoriesData> vmAdapterCategories = null;
        androidx.databinding.ObservableField<java.lang.String> vmAddress = null;
        com.example.plazapalm.views.catergorylist.CategoriesListVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmSearchItems = null;
        java.lang.String vmAddressGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                        // read vm.adapterCategories
                        vmAdapterCategories = vm.getAdapterCategories();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.address
                        vmAddress = vm.getAddress();
                    }
                    updateRegistration(0, vmAddress);


                    if (vmAddress != null) {
                        // read vm.address.get()
                        vmAddressGet = vmAddress.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.searchItems
                        vmSearchItems = vm.getSearchItems();
                    }
                    updateRegistration(1, vmSearchItems);


                    if (vmSearchItems != null) {
                        // read vm.searchItems.get()
                        vmSearchItemsGet = vmSearchItems.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.clMainCategory.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clSearchLocation.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivCategory.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            com.example.plazapalm.utils.BindingAdapters.setRecyclerAdapter(this.rvCategoryLocation, vmAdapterCategories);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, vmSearchItemsGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback10, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvCategoriesLocationCities, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvCategoriesLocationCitiesandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCategoriesLocationCities, vmAddressGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.catergorylist.CategoriesListVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.catergorylist.CategoriesListVM value) {
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
        com.example.plazapalm.views.catergorylist.CategoriesListVM vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {



            vm.onTextChange(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.address
        flag 1 (0x2L): vm.searchItems
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
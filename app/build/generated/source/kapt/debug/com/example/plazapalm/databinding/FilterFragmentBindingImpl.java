package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FilterFragmentBindingImpl extends FilterFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tbFilter, 5);
        sViewsWithIds.put(R.id.tvToolBarFilter, 6);
        sViewsWithIds.put(R.id.clFilterSecond, 7);
        sViewsWithIds.put(R.id.tvFilterLocation, 8);
        sViewsWithIds.put(R.id.viewFilterLocation, 9);
        sViewsWithIds.put(R.id.tvFilterMiles, 10);
        sViewsWithIds.put(R.id.sliderFilter, 11);
        sViewsWithIds.put(R.id.tvFilterMilesValue, 12);
        sViewsWithIds.put(R.id.vFilterSlider, 13);
        sViewsWithIds.put(R.id.tvFilterCategories, 14);
        sViewsWithIds.put(R.id.viewFilterCategory, 15);
        sViewsWithIds.put(R.id.rvFilterCategory, 16);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvFilterLocationDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.location.get()
            //         is vm.location.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvFilterLocationDescription);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.filter.FilterFragmentVM vm = mVm;
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

    public FilterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FilterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (com.google.android.material.slider.Slider) bindings[11]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[9]
            );
        this.btnReportSubmit.setTag(null);
        this.ivFilterBackButton.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvFilterAddCategories.setTag(null);
        this.tvFilterLocationDescription.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setVm((com.example.plazapalm.views.filter.FilterFragmentVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.filter.FilterFragmentVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmLocation((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        com.example.plazapalm.views.filter.FilterFragmentVM vm = mVm;
        java.lang.String vmLocationGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmLocation = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }

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
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.btnReportSubmit.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFilterBackButton.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvFilterAddCategories.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvFilterLocationDescription.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFilterLocationDescription, vmLocationGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFilterLocationDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFilterLocationDescriptionandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.filter.FilterFragmentVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.filter.FilterFragmentVM value) {
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
        flag 0 (0x1L): vm.location
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
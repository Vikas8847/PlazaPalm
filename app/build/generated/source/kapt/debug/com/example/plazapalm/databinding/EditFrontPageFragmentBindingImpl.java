package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditFrontPageFragmentBindingImpl extends EditFrontPageFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvAdvanceEditFrontPage, 5);
        sViewsWithIds.put(R.id.scrollAdvanceEditLook, 6);
        sViewsWithIds.put(R.id.checkEditFrontPageTopText, 7);
        sViewsWithIds.put(R.id.viewEditTopTextFrontPage, 8);
        sViewsWithIds.put(R.id.checkBottomTextFrontPage, 9);
        sViewsWithIds.put(R.id.viewEditBottomTextFrontPage, 10);
        sViewsWithIds.put(R.id.tvAdvanceEditFrontPageFont, 11);
        sViewsWithIds.put(R.id.viewEditFontPage, 12);
        sViewsWithIds.put(R.id.tvAdvanceEditFrontPageFontColor, 13);
        sViewsWithIds.put(R.id.viewBoxLookingBGColor, 14);
        sViewsWithIds.put(R.id.viewEditFontColor, 15);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvAdvanceEditFrontPageFontValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.fontsName.get()
            //         is vm.fontsName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvAdvanceEditFrontPageFontValue);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.fontsName.get()
            java.lang.String vmFontsNameGet = null;
            // vm
            com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM vm = mVm;
            // vm.fontsName != null
            boolean vmFontsNameJavaLangObjectNull = false;
            // vm.fontsName
            androidx.databinding.ObservableField<java.lang.String> vmFontsName = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmFontsName = vm.getFontsName();

                vmFontsNameJavaLangObjectNull = (vmFontsName) != (null);
                if (vmFontsNameJavaLangObjectNull) {




                    vmFontsName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public EditFrontPageFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private EditFrontPageFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[9]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[7]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[8]
            );
        this.btnEditFrontLookAttach.setTag(null);
        this.btnEditFrontPageView.setTag(null);
        this.clCoordinateEditCoverPage.setTag(null);
        this.ivAdvanceEditFrontPage.setTag(null);
        this.tvAdvanceEditFrontPageFontValue.setTag(null);
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
            setVm((com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM Vm) {
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
                return onChangeVmFontsName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmFontsName(androidx.databinding.ObservableField<java.lang.String> VmFontsName, int fieldId) {
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
        java.lang.String vmFontsNameGet = null;
        android.graphics.Typeface vmFontTypeface = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmFontsName = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (vm != null) {
                        // read vm.fontTypeface
                        vmFontTypeface = vm.getFontTypeface();
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }

                if (vm != null) {
                    // read vm.fontsName
                    vmFontsName = vm.getFontsName();
                }
                updateRegistration(0, vmFontsName);


                if (vmFontsName != null) {
                    // read vm.fontsName.get()
                    vmFontsNameGet = vmFontsName.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.btnEditFrontLookAttach.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.btnEditFrontPageView.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivAdvanceEditFrontPage.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvAdvanceEditFrontPageFontValue.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvAdvanceEditFrontPageFontValue.setTypeface(vmFontTypeface);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAdvanceEditFrontPageFontValue, vmFontsNameGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvAdvanceEditFrontPageFontValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvAdvanceEditFrontPageFontValueandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM value) {
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
        flag 0 (0x1L): vm.fontsName
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdvanceEditLookFragmentBindingImpl extends AdvanceEditLookFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvAdvanceEditLook, 9);
        sViewsWithIds.put(R.id.scrollAdvanceEditLook, 10);
        sViewsWithIds.put(R.id.tvAdvanceEditLookBGColor, 11);
        sViewsWithIds.put(R.id.viewEditLookBGColor, 12);
        sViewsWithIds.put(R.id.tvAdvanceEditLookColumnColor, 13);
        sViewsWithIds.put(R.id.viewEditColumnBGColor, 14);
        sViewsWithIds.put(R.id.tvAdvanceEditLookBorderColor, 15);
        sViewsWithIds.put(R.id.viewEditBorderColor, 16);
        sViewsWithIds.put(R.id.tvAdvanceEditLookFont, 17);
        sViewsWithIds.put(R.id.viewEditFont, 18);
        sViewsWithIds.put(R.id.tvAdvanceEditLookFontColor, 19);
        sViewsWithIds.put(R.id.viewEditFontColor, 20);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AdvanceEditLookFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private AdvanceEditLookFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[12]
            );
        this.btnAdvanceEditLookAttach.setTag(null);
        this.btnAdvanceEditLookView.setTag(null);
        this.ivAdvanceEditLookBack.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAdvanceEditLookFontValues.setTag(null);
        this.viewBoxBorderColor.setTag(null);
        this.viewBoxColumnBGColor.setTag(null);
        this.viewBoxEditFonts.setTag(null);
        this.viewBoxLookingBGColor.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setVm((com.example.plazapalm.views.advancesettings.editlook.AdvanceEditLookVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.advancesettings.editlook.AdvanceEditLookVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.plazapalm.views.advancesettings.editlook.AdvanceEditLookVM vm = mVm;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (vm != null) {
                    // read vm::onClicks
                    vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btnAdvanceEditLookAttach.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.btnAdvanceEditLookView.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivAdvanceEditLookBack.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvAdvanceEditLookFontValues.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.viewBoxBorderColor.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.viewBoxColumnBGColor.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.viewBoxEditFonts.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.viewBoxLookingBGColor.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.advancesettings.editlook.AdvanceEditLookVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.advancesettings.editlook.AdvanceEditLookVM value) {
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
        flag 0 (0x1L): vm
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
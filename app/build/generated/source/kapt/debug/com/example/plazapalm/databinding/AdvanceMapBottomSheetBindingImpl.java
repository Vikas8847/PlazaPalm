package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdvanceMapBottomSheetBindingImpl extends AdvanceMapBottomSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvMapDarkTheme, 1);
        sViewsWithIds.put(R.id.switchAdvanceMap, 2);
        sViewsWithIds.put(R.id.vAdvanceMapDarkTheme, 3);
        sViewsWithIds.put(R.id.tvMapLocationOnOff, 4);
        sViewsWithIds.put(R.id.switchMapLocationOnOff, 5);
        sViewsWithIds.put(R.id.vAdvanceMapLocationOnOff, 6);
        sViewsWithIds.put(R.id.tvAdvanceMapFollow, 7);
        sViewsWithIds.put(R.id.switchMapFollow, 8);
        sViewsWithIds.put(R.id.vAdvanceMapFollow, 9);
        sViewsWithIds.put(R.id.tvAdvanceMapDummy, 10);
        sViewsWithIds.put(R.id.switchMapDummy, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdvanceMapBottomSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private AdvanceMapBottomSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.SwitchCompat) bindings[2]
            , (androidx.appcompat.widget.SwitchCompat) bindings[11]
            , (androidx.appcompat.widget.SwitchCompat) bindings[8]
            , (androidx.appcompat.widget.SwitchCompat) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[6]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
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
            setVm((com.example.plazapalm.views.advancesettings.map.AdvanceMapVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.advancesettings.map.AdvanceMapVM Vm) {
        this.mVm = Vm;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
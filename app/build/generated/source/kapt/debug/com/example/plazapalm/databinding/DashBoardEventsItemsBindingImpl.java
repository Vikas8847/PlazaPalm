package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DashBoardEventsItemsBindingImpl extends DashBoardEventsItemsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DashBoardEventsItemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private DashBoardEventsItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvDashBoardSelectedEvents.setTag(null);
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
            setVm((com.example.plazapalm.views.dashboard.DashBoardVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.dashboard.DashBoardVM Vm) {
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
                return onChangeVmIsClicked((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsClicked(androidx.databinding.ObservableBoolean VmIsClicked, int fieldId) {
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
        androidx.databinding.ObservableBoolean vmIsClicked = null;
        com.example.plazapalm.views.dashboard.DashBoardVM vm = mVm;
        com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.SelectedDataModel> vmDashSelectedAdapter = null;
        boolean VmIsClicked1 = false;
        int vmIsClickedViewVISIBLEViewGONE = 0;
        boolean vmIsClickedGet = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.isClicked
                    vmIsClicked = vm.isClicked();
                }
                updateRegistration(0, vmIsClicked);


                if (vmIsClicked != null) {
                    // read vm.isClicked.get()
                    vmIsClickedGet = vmIsClicked.get();
                }


                // read !vm.isClicked.get()
                VmIsClicked1 = !vmIsClickedGet;
            if((dirtyFlags & 0x7L) != 0) {
                if(VmIsClicked1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read !vm.isClicked.get() ? View.VISIBLE : View.GONE
                vmIsClickedViewVISIBLEViewGONE = ((VmIsClicked1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if ((dirtyFlags & 0x6L) != 0) {

                    if (vm != null) {
                        // read vm.dashSelectedAdapter
                        vmDashSelectedAdapter = vm.getDashSelectedAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setRecyclerAdapter(this.rvDashBoardSelectedEvents, vmDashSelectedAdapter);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.rvDashBoardSelectedEvents.setVisibility(vmIsClickedViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isClicked
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
        flag 3 (0x4L): !vm.isClicked.get() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): !vm.isClicked.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}
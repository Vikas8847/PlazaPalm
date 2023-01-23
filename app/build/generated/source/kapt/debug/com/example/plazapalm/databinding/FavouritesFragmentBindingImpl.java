package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FavouritesFragmentBindingImpl extends FavouritesFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvFavouritesToolBar, 4);
        sViewsWithIds.put(R.id.constraintLayout, 5);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FavouritesFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FavouritesFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.ivFavBackBtn.setTag(null);
        this.listemptyId.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvFavourites.setTag(null);
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
            setVm((com.example.plazapalm.views.favourites.FavouritesVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.favourites.FavouritesVM Vm) {
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
                return onChangeVmNoData((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmNoData(androidx.databinding.ObservableBoolean VmNoData, int fieldId) {
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
        com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.FavData> vmFavAdapter = null;
        com.example.plazapalm.views.favourites.FavouritesVM vm = mVm;
        java.lang.String vmNoDataListemptyIdAndroidStringNoFavoritesYetListemptyIdAndroidStringSpace = null;
        androidx.databinding.ObservableBoolean vmNoData = null;
        boolean vmNoDataGet = false;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                        // read vm.favAdapter
                        vmFavAdapter = vm.getFavAdapter();
                    }
            }

                if (vm != null) {
                    // read vm.noData
                    vmNoData = vm.getNoData();
                }
                updateRegistration(0, vmNoData);


                if (vmNoData != null) {
                    // read vm.noData.get()
                    vmNoDataGet = vmNoData.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(vmNoDataGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read vm.noData.get() ? @android:string/no_favorites_yet : @android:string/space
                vmNoDataListemptyIdAndroidStringNoFavoritesYetListemptyIdAndroidStringSpace = ((vmNoDataGet) ? (listemptyId.getResources().getString(R.string.no_favorites_yet)) : (listemptyId.getResources().getString(R.string.space)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.ivFavBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            com.example.plazapalm.utils.BindingAdapters.setRecyclerAdapter(this.rvFavourites, vmFavAdapter);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.listemptyId, vmNoDataListemptyIdAndroidStringNoFavoritesYetListemptyIdAndroidStringSpace);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.favourites.FavouritesVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.favourites.FavouritesVM value) {
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
        flag 0 (0x1L): vm.noData
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
        flag 3 (0x4L): vm.noData.get() ? @android:string/no_favorites_yet : @android:string/space
        flag 4 (0x5L): vm.noData.get() ? @android:string/no_favorites_yet : @android:string/space
    flag mapping end*/
    //end
}
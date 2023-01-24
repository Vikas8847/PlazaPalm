package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DashBoardItemsBindingImpl extends DashBoardItemsBinding implements com.example.plazapalm.generated.callback.OnClickListener.Listener {

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
    private final androidx.appcompat.widget.AppCompatImageView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DashBoardItemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DashBoardItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.ivDashBoardCat.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.playerLayout.setTag(null);
        this.tvDashBoardItemDescription.setTag(null);
        this.tvDashBoardItemDistance.setTag(null);
        this.tvDashBoardItemLastName.setTag(null);
        this.tvDashBoardItemLocation.setTag(null);
        this.tvDashBoardItemName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
        mCallback14 = new com.example.plazapalm.generated.callback.OnClickListener(this, 2);
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
        if (BR.model == variableId) {
            setModel((com.example.plazapalm.models.ProfileCateData) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.example.plazapalm.views.dashboard.DashBoardVM) variable);
        }
        else if (BR.mContext == variableId) {
            setMContext((android.content.Context) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.ProfileCateData Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setVm(@Nullable com.example.plazapalm.views.dashboard.DashBoardVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setMContext(@Nullable android.content.Context MContext) {
        this.mMContext = MContext;
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
        com.example.plazapalm.models.ProfileCateData model = mModel;
        java.lang.String modelUserNameTrim = null;
        java.lang.String modelUserName = null;
        java.lang.String modelAddress = null;
        com.example.plazapalm.pref.PreferenceFile vmPref = null;
        java.lang.String modelLastName = null;
        com.example.plazapalm.views.dashboard.DashBoardVM vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite = false;
        java.lang.String modelFirstName = null;
        double androidxDatabindingViewDataBindingSafeUnboxModelLat = 0.0;
        double androidxDatabindingViewDataBindingSafeUnboxModelLngValue = 0.0;
        android.graphics.drawable.Drawable modelIsFavouriteMboundView4AndroidDrawableIcHeartFilledIconMboundView4AndroidDrawableIcHeartIcon = null;
        java.lang.Double modelLngValue = null;
        java.lang.String modelPostProfilePicture0 = null;
        java.lang.Boolean modelIsFavourite = null;
        java.util.List<java.lang.String> modelPostProfilePicture = null;
        java.lang.Double modelLat = null;

        if ((dirtyFlags & 0xbL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (model != null) {
                        // read model.user_name
                        modelUserName = model.getUser_name();
                        // read model.address
                        modelAddress = model.getAddress();
                        // read model.last_name
                        modelLastName = model.getLast_name();
                        // read model.first_name
                        modelFirstName = model.getFirst_name();
                        // read model.isFavourite()
                        modelIsFavourite = model.isFavourite();
                        // read model.postProfile_picture
                        modelPostProfilePicture = model.getPostProfile_picture();
                    }


                    if (modelUserName != null) {
                        // read model.user_name.trim()
                        modelUserNameTrim = modelUserName.trim();
                    }
                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite())
                    androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite = androidx.databinding.ViewDataBinding.safeUnbox(modelIsFavourite);
                if((dirtyFlags & 0x9L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
                    if (modelPostProfilePicture != null) {
                        // read model.postProfile_picture[0]
                        modelPostProfilePicture0 = getFromList(modelPostProfilePicture, 0);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite()) ? @android:drawable/ic_heart_filled_icon : @android:drawable/ic_heart_icon
                    modelIsFavouriteMboundView4AndroidDrawableIcHeartFilledIconMboundView4AndroidDrawableIcHeartIcon = ((androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.ic_heart_filled_icon)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.ic_heart_icon)));
            }

                if (model != null) {
                    // read model.lngValue
                    modelLngValue = model.getLngValue();
                    // read model.lat
                    modelLat = model.getLat();
                }
                if (vm != null) {
                    // read vm.pref
                    vmPref = vm.getPref();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(model.lngValue)
                androidxDatabindingViewDataBindingSafeUnboxModelLngValue = androidx.databinding.ViewDataBinding.safeUnbox(modelLngValue);
                // read androidx.databinding.ViewDataBinding.safeUnbox(model.lat)
                androidxDatabindingViewDataBindingSafeUnboxModelLat = androidx.databinding.ViewDataBinding.safeUnbox(modelLat);
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setImage(this.ivDashBoardCat, modelPostProfilePicture0);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView4, modelIsFavouriteMboundView4AndroidDrawableIcHeartFilledIconMboundView4AndroidDrawableIcHeartIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemDescription, modelUserNameTrim);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemLastName, modelLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemLocation, modelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemName, modelFirstName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback14);
            this.playerLayout.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.calculateLatLngToMiles(this.tvDashBoardItemDistance, vmPref, androidxDatabindingViewDataBindingSafeUnboxModelLat, androidxDatabindingViewDataBindingSafeUnboxModelLngValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.ProfileCateData model = mModel;
                // model.adapterPosition
                int modelAdapterPosition = 0;
                // model.onItemClick
                com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick modelOnItemClick = null;
                // model != null
                boolean modelJavaLangObjectNull = false;
                // model.onItemClick != null
                boolean modelOnItemClickJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {


                    modelOnItemClick = model.getOnItemClick();

                    modelOnItemClickJavaLangObjectNull = (modelOnItemClick) != (null);
                    if (modelOnItemClickJavaLangObjectNull) {





                        modelAdapterPosition = model.getAdapterPosition();


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "dashItemClick");
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.ProfileCateData model = mModel;
                // model.adapterPosition
                int modelAdapterPosition = 0;
                // model.onItemClick
                com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick modelOnItemClick = null;
                // model != null
                boolean modelJavaLangObjectNull = false;
                // model.onItemClick != null
                boolean modelOnItemClickJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {


                    modelOnItemClick = model.getOnItemClick();

                    modelOnItemClickJavaLangObjectNull = (modelOnItemClick) != (null);
                    if (modelOnItemClickJavaLangObjectNull) {





                        modelAdapterPosition = model.getAdapterPosition();


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "dashItemClick_fav");
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): vm
        flag 2 (0x3L): mContext
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite()) ? @android:drawable/ic_heart_filled_icon : @android:drawable/ic_heart_icon
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite()) ? @android:drawable/ic_heart_filled_icon : @android:drawable/ic_heart_icon
    flag mapping end*/
    //end
}
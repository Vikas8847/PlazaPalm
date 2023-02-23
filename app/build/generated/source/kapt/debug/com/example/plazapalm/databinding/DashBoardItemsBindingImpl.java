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
        super(bindingComponent, root, 2
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
                mDirtyFlags = 0x40L;
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
        else if (BR.mView == variableId) {
            setMView((android.view.View) variable);
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setMView(@Nullable android.view.View MView) {
        this.mMView = MView;
    }
    public void setVm(@Nullable com.example.plazapalm.views.dashboard.DashBoardVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
            case 0 :
                return onChangeVmLati((androidx.databinding.ObservableDouble) object, fieldId);
            case 1 :
                return onChangeVmLongi((androidx.databinding.ObservableDouble) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmLati(androidx.databinding.ObservableDouble VmLati, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLongi(androidx.databinding.ObservableDouble VmLongi, int fieldId) {
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
        com.example.plazapalm.models.ProfileCateData model = mModel;
        androidx.databinding.ObservableDouble vmLati = null;
        java.lang.String modelUserNameTrim = null;
        java.lang.String modelUserName = null;
        java.lang.String modelAddress = null;
        java.lang.String modelLastName = null;
        com.example.plazapalm.views.dashboard.DashBoardVM vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite = false;
        java.lang.String modelFirstName = null;
        double androidxDatabindingViewDataBindingSafeUnboxModelLngValue = 0.0;
        int modelMediaType = 0;
        double vmLatiGet = 0.0;
        android.graphics.drawable.Drawable modelIsFavouriteMboundView4AndroidDrawableIcHeartFilledIconMboundView4AndroidDrawableIcHeartIcon = null;
        java.lang.Double modelLngValue = null;
        double vmLongiGet = 0.0;
        androidx.databinding.ObservableDouble vmLongi = null;
        java.lang.String modelPostProfilePicture0 = null;
        java.lang.Boolean modelIsFavourite = null;
        java.util.List<java.lang.String> modelPostProfilePicture = null;
        double modelLat = 0.0;
        boolean modelMediaTypeInt1 = false;
        int modelMediaTypeInt1MViewVISIBLEMViewVISIBLE = 0;
        java.lang.String modelLocationText = null;

        if ((dirtyFlags & 0x57L) != 0) {


            if ((dirtyFlags & 0x44L) != 0) {

                    if (model != null) {
                        // read model.user_name
                        modelUserName = model.getUser_name();
                        // read model.address
                        modelAddress = model.getAddress();
                        // read model.last_name
                        modelLastName = model.getLast_name();
                        // read model.first_name
                        modelFirstName = model.getFirst_name();
                        // read model.mediaType
                        modelMediaType = model.getMediaType();
                        // read model.isFavourite()
                        modelIsFavourite = model.isFavourite();
                        // read model.postProfile_picture
                        modelPostProfilePicture = model.getPostProfile_picture();
                    }


                    if (modelUserName != null) {
                        // read model.user_name.trim()
                        modelUserNameTrim = modelUserName.trim();
                    }
                    // read model.mediaType == 1
                    modelMediaTypeInt1 = (modelMediaType) == (1);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite())
                    androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite = androidx.databinding.ViewDataBinding.safeUnbox(modelIsFavourite);
                if((dirtyFlags & 0x44L) != 0) {
                    if(modelMediaTypeInt1) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x44L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
                    if (modelPostProfilePicture != null) {
                        // read model.postProfile_picture[0]
                        modelPostProfilePicture0 = getFromList(modelPostProfilePicture, 0);
                    }


                    // read model.mediaType == 1 ? View.VISIBLE : View.VISIBLE
                    modelMediaTypeInt1MViewVISIBLEMViewVISIBLE = ((modelMediaTypeInt1) ? (android.view.View.VISIBLE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite()) ? @android:drawable/ic_heart_filled_icon : @android:drawable/ic_heart_icon
                    modelIsFavouriteMboundView4AndroidDrawableIcHeartFilledIconMboundView4AndroidDrawableIcHeartIcon = ((androidxDatabindingViewDataBindingSafeUnboxModelIsFavourite) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.ic_heart_filled_icon)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.ic_heart_icon)));
            }

                if (model != null) {
                    // read model.lngValue
                    modelLngValue = model.getLngValue();
                    // read model.lat
                    modelLat = model.getLat();
                    // read model.location_text
                    modelLocationText = model.getLocation_text();
                }
                if (vm != null) {
                    // read vm.lati
                    vmLati = vm.getLati();
                    // read vm.longi
                    vmLongi = vm.getLongi();
                }
                updateRegistration(0, vmLati);
                updateRegistration(1, vmLongi);


                // read androidx.databinding.ViewDataBinding.safeUnbox(model.lngValue)
                androidxDatabindingViewDataBindingSafeUnboxModelLngValue = androidx.databinding.ViewDataBinding.safeUnbox(modelLngValue);
                if (vmLati != null) {
                    // read vm.lati.get()
                    vmLatiGet = vmLati.get();
                }
                if (vmLongi != null) {
                    // read vm.longi.get()
                    vmLongiGet = vmLongi.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setImage(this.ivDashBoardCat, modelPostProfilePicture0);
            this.ivDashBoardCat.setVisibility(modelMediaTypeInt1MViewVISIBLEMViewVISIBLE);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView4, modelIsFavouriteMboundView4AndroidDrawableIcHeartFilledIconMboundView4AndroidDrawableIcHeartIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemDescription, modelUserNameTrim);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemLastName, modelLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemLocation, modelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemName, modelFirstName);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback14);
            this.playerLayout.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0x57L) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.calculateDistance(this.tvDashBoardItemDistance, modelLocationText, modelLat, androidxDatabindingViewDataBindingSafeUnboxModelLngValue, vmLatiGet, vmLongiGet);
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
        flag 0 (0x1L): vm.lati
        flag 1 (0x2L): vm.longi
        flag 2 (0x3L): model
        flag 3 (0x4L): mView
        flag 4 (0x5L): vm
        flag 5 (0x6L): mContext
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite()) ? @android:drawable/ic_heart_filled_icon : @android:drawable/ic_heart_icon
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(model.isFavourite()) ? @android:drawable/ic_heart_filled_icon : @android:drawable/ic_heart_icon
        flag 9 (0xaL): model.mediaType == 1 ? View.VISIBLE : View.VISIBLE
        flag 10 (0xbL): model.mediaType == 1 ? View.VISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}
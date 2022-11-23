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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvDashBoardItemDistanceandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.distanceCal.get()
            //         is vm.distanceCal.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDashBoardItemDistance);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.dashboard.DashBoardVM vm = mVm;
            // vm.distanceCal
            androidx.databinding.ObservableField<java.lang.String> vmDistanceCal = null;
            // vm.distanceCal.get()
            java.lang.String vmDistanceCalGet = null;
            // vm.distanceCal != null
            boolean vmDistanceCalJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDistanceCal = vm.getDistanceCal();

                vmDistanceCalJavaLangObjectNull = (vmDistanceCal) != (null);
                if (vmDistanceCalJavaLangObjectNull) {




                    vmDistanceCal.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DashBoardItemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DashBoardItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.ivDashBoardCat.setTag(null);
        this.playerLayout.setTag(null);
        this.tvDashBoardItemDescription.setTag(null);
        this.tvDashBoardItemDistance.setTag(null);
        this.tvDashBoardItemLocation.setTag(null);
        this.tvDashBoardItemName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
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
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.ProfileCateData Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setVm(@Nullable com.example.plazapalm.views.dashboard.DashBoardVM Vm) {
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
                return onChangeVmDistanceCal((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmDistanceCal(androidx.databinding.ObservableField<java.lang.String> VmDistanceCal, int fieldId) {
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
        com.example.plazapalm.models.ProfileCateData model = mModel;
        java.lang.String modelPostProfilePicture0 = null;
        java.lang.String modelDescription1 = null;
        java.lang.String modelLastName = null;
        com.example.plazapalm.views.dashboard.DashBoardVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmDistanceCal = null;
        java.lang.String modelFirstNameJavaLangStringNModelLastName = null;
        java.util.List<java.lang.String> modelPostProfilePicture = null;
        java.lang.String modelFirstName = null;
        java.lang.String vmDistanceCalGet = null;
        java.lang.String modelLocationText = null;
        java.lang.String modelFirstNameJavaLangStringN = null;

        if ((dirtyFlags & 0xaL) != 0) {



                if (model != null) {
                    // read model.description_1
                    modelDescription1 = model.getDescription_1();
                    // read model.last_name
                    modelLastName = model.getLast_name();
                    // read model.postProfile_picture
                    modelPostProfilePicture = model.getPostProfile_picture();
                    // read model.first_name
                    modelFirstName = model.getFirst_name();
                    // read model.location_text
                    modelLocationText = model.getLocation_text();
                }


                if (modelPostProfilePicture != null) {
                    // read model.postProfile_picture[0]
                    modelPostProfilePicture0 = getFromList(modelPostProfilePicture, 0);
                }
                // read (model.first_name) + ("\n")
                modelFirstNameJavaLangStringN = (modelFirstName) + ("\n");


                // read ((model.first_name) + ("\n")) + (model.last_name)
                modelFirstNameJavaLangStringNModelLastName = (modelFirstNameJavaLangStringN) + (modelLastName);
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (vm != null) {
                    // read vm.distanceCal
                    vmDistanceCal = vm.getDistanceCal();
                }
                updateRegistration(0, vmDistanceCal);


                if (vmDistanceCal != null) {
                    // read vm.distanceCal.get()
                    vmDistanceCalGet = vmDistanceCal.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setImage(this.ivDashBoardCat, modelPostProfilePicture0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemDescription, modelDescription1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemLocation, modelLocationText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemName, modelFirstNameJavaLangStringNModelLastName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.playerLayout.setOnClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDashBoardItemDistance, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDashBoardItemDistanceandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemDistance, vmDistanceCalGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
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
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.distanceCal
        flag 1 (0x2L): model
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
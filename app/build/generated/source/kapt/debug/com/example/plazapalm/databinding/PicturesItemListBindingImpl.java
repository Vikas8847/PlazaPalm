package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PicturesItemListBindingImpl extends PicturesItemListBinding implements com.example.plazapalm.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PicturesItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private PicturesItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.VideoView) bindings[4]
            );
        this.ivPictures.setTag(null);
        this.ivPicturesDeleteImgVideo.setTag(null);
        this.ivPicturesVideoView.setTag(null);
        this.ivVideoIcon.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.videoView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.example.plazapalm.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
        mCallback10 = new com.example.plazapalm.generated.callback.OnClickListener(this, 5);
        mCallback9 = new com.example.plazapalm.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.example.plazapalm.generated.callback.OnClickListener(this, 2);
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
        if (BR.model == variableId) {
            setModel((com.example.plazapalm.models.PicturesModel) variable);
        }
        else if (BR.view == variableId) {
            setView((android.view.View) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.PicturesModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setView(@Nullable android.view.View View) {
        this.mView = View;
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
        com.example.plazapalm.models.PicturesModel model = mModel;
        int modelTypeInt1ViewGONEViewVISIBLE = 0;
        java.lang.String modelImage = null;
        int modelTypeInt2ViewGONEViewVISIBLE = 0;
        boolean modelTypeInt2 = false;
        int modelType = 0;
        int modelTypeInt1ViewGONEViewGONE = 0;
        boolean modelTypeInt1 = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.image
                    modelImage = model.getImage();
                    // read model.type
                    modelType = model.getType();
                }


                // read model.type == 2
                modelTypeInt2 = (modelType) == (2);
                // read model.type == 1
                modelTypeInt1 = (modelType) == (1);
            if((dirtyFlags & 0x5L) != 0) {
                if(modelTypeInt2) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(modelTypeInt1) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read model.type == 2 ? View.GONE : View.VISIBLE
                modelTypeInt2ViewGONEViewVISIBLE = ((modelTypeInt2) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read model.type == 1 ? View.GONE : View.VISIBLE
                modelTypeInt1ViewGONEViewVISIBLE = ((modelTypeInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read model.type == 1 ? View.GONE : View.GONE
                modelTypeInt1ViewGONEViewGONE = ((modelTypeInt1) ? (android.view.View.GONE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.ivPictures.setOnClickListener(mCallback6);
            this.ivPicturesDeleteImgVideo.setOnClickListener(mCallback10);
            this.ivPicturesVideoView.setOnClickListener(mCallback7);
            this.ivVideoIcon.setOnClickListener(mCallback8);
            this.videoView.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setHeartImage(this.ivPictures, modelImage);
            this.ivPictures.setVisibility(modelTypeInt2ViewGONEViewVISIBLE);
            com.example.plazapalm.utils.BindingAdapters.setHeartImage(this.ivPicturesVideoView, modelImage);
            this.ivPicturesVideoView.setVisibility(modelTypeInt1ViewGONEViewGONE);
            this.ivVideoIcon.setVisibility(modelTypeInt1ViewGONEViewVISIBLE);
            com.example.plazapalm.utils.BindingAdapters.setVideoImage(this.videoView, modelImage);
            this.videoView.setVisibility(modelTypeInt1ViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.PicturesModel model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "picturesItemClick");
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.PicturesModel model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "picturesItemClick");
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.PicturesModel model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "deleteImageVideo");
                    }
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.PicturesModel model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "picturesItemClick");
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.PicturesModel model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "picturesItemClick");
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
        flag 1 (0x2L): view
        flag 2 (0x3L): null
        flag 3 (0x4L): model.type == 1 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): model.type == 1 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): model.type == 2 ? View.GONE : View.VISIBLE
        flag 6 (0x7L): model.type == 2 ? View.GONE : View.VISIBLE
        flag 7 (0x8L): model.type == 1 ? View.GONE : View.GONE
        flag 8 (0x9L): model.type == 1 ? View.GONE : View.GONE
    flag mapping end*/
    //end
}
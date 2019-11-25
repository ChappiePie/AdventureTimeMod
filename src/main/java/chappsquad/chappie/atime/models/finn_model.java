package chappsquad.chappie.atime.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Finn_Helmet - Made by Chappie
 * Created using Tabula 7.1.0
 */

public class finn_model extends ModelBiped {
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape15_3;
    public ModelRenderer shape15_4;
    public ModelRenderer shape15_5;
    public ModelRenderer shape15_6;
    public ModelRenderer shape15_7;
    public ModelRenderer shape15_8;
    public ModelRenderer shape15_9;
    public ModelRenderer shape15_10;
    public ModelRenderer shape15_11;

    public finn_model() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shape15_6 = new ModelRenderer(this, 106, 0);
        this.shape15_6.setRotationPoint(-4.0F, -7.0F, -5.0F);
        this.shape15_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_3 = new ModelRenderer(this, 88, 0);
        this.shape15_3.setRotationPoint(-5.0F, -8.0F, -5.0F);
        this.shape15_3.addBox(0.0F, 0.0F, 0.0F, 1, 8, 9, 0.0F);
        this.shape15_11 = new ModelRenderer(this, 106, 0);
        this.shape15_11.setRotationPoint(3.0F, -7.0F, -5.0F);
        this.shape15_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15 = new ModelRenderer(this, 88, 6);
        this.shape15.setRotationPoint(-5.0F, 0.0F, -5.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 10, 1, 10, 0.0F);
        this.shape15_5 = new ModelRenderer(this, 106, 6);
        this.shape15_5.setRotationPoint(-5.0F, -8.0F, 4.0F);
        this.shape15_5.addBox(0.0F, 0.0F, 0.0F, 10, 8, 1, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 88, 0);
        this.shape15_1.setRotationPoint(-5.0F, -11.0F, -3.0F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.shape15_7 = new ModelRenderer(this, 106, 0);
        this.shape15_7.setRotationPoint(3.0F, -1.0F, -5.0F);
        this.shape15_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_9 = new ModelRenderer(this, 106, 0);
        this.shape15_9.setRotationPoint(-4.0F, -8.0F, -5.0F);
        this.shape15_9.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.shape15_10 = new ModelRenderer(this, 88, 0);
        this.shape15_10.setRotationPoint(3.0F, -11.0F, -3.0F);
        this.shape15_10.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.shape15_8 = new ModelRenderer(this, 106, 0);
        this.shape15_8.setRotationPoint(-4.0F, -1.0F, -5.0F);
        this.shape15_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_2 = new ModelRenderer(this, 106, 6);
        this.shape15_2.setRotationPoint(4.0F, -8.0F, -5.0F);
        this.shape15_2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 9, 0.0F);
        this.shape15_4 = new ModelRenderer(this, 88, 0);
        this.shape15_4.setRotationPoint(-5.0F, -9.0F, -5.0F);
        this.shape15_4.addBox(0.0F, 0.0F, 0.0F, 10, 1, 10, 0.0F);
        
        this.bipedHead.addChild(shape15);
        this.bipedHead.addChild(shape15_1);
        this.bipedHead.addChild(shape15_2);
        this.bipedHead.addChild(shape15_3);
        this.bipedHead.addChild(shape15_4);
        this.bipedHead.addChild(shape15_5);
        this.bipedHead.addChild(shape15_6);
        this.bipedHead.addChild(shape15_7);
        this.bipedHead.addChild(shape15_8);
        this.bipedHead.addChild(shape15_9);
        this.bipedHead.addChild(shape15_10);
        this.bipedHead.addChild(shape15_11);
        
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}


// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class Toro_Inuoe extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Toro_Inuoe() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 11).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(7, 10).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 6).addBox(-2.0F, -7.0F, 0.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(8, 8).addBox(-5.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(8, 6).addBox(1.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(11, 10).addBox(-2.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(9, 0).addBox(0.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
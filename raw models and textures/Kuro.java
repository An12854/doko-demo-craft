// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Kuro extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Kuro() {
		texWidth = 16;
		texHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(11, 9).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 11).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 6).addBox(-2.0F, -7.0F, 0.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-2.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.texOffs(7, 10).addBox(-3.0F, -7.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(8, 6).addBox(1.0F, -7.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(11, 5).addBox(-2.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(9, 0).addBox(0.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
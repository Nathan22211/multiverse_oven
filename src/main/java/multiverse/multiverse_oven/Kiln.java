package multiverse.multiverse_oven;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Kiln implements ModInitializer {
	public static final String MODID = "oven";

	public static final Block KILN = Registry.register(Registry.BLOCK, new Identifier(MODID, MODID), new KilnBlock(FabricBlockSettings.copy(Blocks.BRICKS)));
	public static final BlockEntityType<KilnBlockEntity> KILN_BE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MODID, MODID), BlockEntityType.Builder.create(KilnBlockEntity::new, KILN).build(null));
	public static final RecipeType<FiringRecipe> COOKING = RecipeType.register("oven:cooking");
	public static final RecipeSerializer<FiringRecipe> FIRING_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MODID, "cooking"), new CookingRecipeSerializer<>(FiringRecipe::new, 100));
	public static final ScreenHandlerType<KilnScreenHandler> OVEN_SCREEN_HANDLER = Registry.register(Registry.SCREEN_HANDLER, new Identifier(MODID, MODID), new ScreenHandlerType<>(KilnScreenHandler::new));
	public static final Identifier INTERACT_WITH_OVEN = new Identifier(MODID, "interact_with_oven");

	@Override
	public void onInitialize() {
		Registry.register(Registry.CUSTOM_STAT, INTERACT_WITH_OVEN, INTERACT_WITH_OVEN);
		Stats.CUSTOM.getOrCreateStat(INTERACT_WITH_OVEN);
		Registry.register(Registry.ITEM, new Identifier(MODID, MODID), new BlockItem(KILN, new Item.Settings().group(ItemGroup.DECORATIONS)));
	}
}

package multiverse.multiverse_oven;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;

public class FiringRecipe extends AbstractCookingRecipe {
	public FiringRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
	super(Kiln.COOKING, id, group, input, output, experience, cookTime);
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return Kiln.FIRING_SERIALIZER;
	}
}

package multiverse.multiverse_oven;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class KilnScreenHandler extends AbstractFurnaceScreenHandler {
	//why is it an enum aaaaaaaaaaaaaaaaaaaaaaaaaa
	public KilnScreenHandler(int syncId, PlayerInventory playerInventory) {
		super(Kiln.OVEN_SCREEN_HANDLER, Kiln.COOKING, RecipeBookCategory.FURNACE, syncId, playerInventory);
	}

	public KilnScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
		super(Kiln.OVEN_SCREEN_HANDLER, Kiln.COOKING, RecipeBookCategory.FURNACE, syncId, playerInventory, inventory, propertyDelegate);
	}
}

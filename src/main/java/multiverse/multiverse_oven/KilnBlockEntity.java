package multiverse.multiverse_oven;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity {
	protected KilnBlockEntity() {
		super(Kiln.KILN_BE, Kiln.COOKING);
	}

	@Override
	protected Text getContainerName() {
		return new TranslatableText("container.oven.oven");
	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new KilnScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}

	@Override
	protected int getFuelTime(ItemStack fuel) {
		return super.getFuelTime(fuel) / 2;
	}
}
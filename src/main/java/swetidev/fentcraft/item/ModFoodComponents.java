package swetidev.fentcraft.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent FENTANYL = new FoodComponent.Builder()
            .alwaysEdible()
            .saturationModifier(-1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,2000,2),0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,3000,1),0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,500,1), 1f)
            .build();
}

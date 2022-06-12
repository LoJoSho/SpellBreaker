package me.lojosho.spellbreaker;

import com.willfp.eco.core.EcoPlugin;
import com.willfp.eco.core.extensions.Extension;
import com.willfp.ecoenchants.enchantments.EcoEnchant;

public final class SpellBreakerMain extends Extension {
    public static final EcoEnchant SPELLBREAKER = new SpellBreaker();

    public SpellBreakerMain(final EcoPlugin plugin) {
        super(plugin);
    }

    @Override
    protected void onEnable() {
        // Handled by super
    }

    @Override
    protected void onDisable() {
        // handled by super
    }
}

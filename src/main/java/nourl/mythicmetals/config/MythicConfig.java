package nourl.mythicmetals.config;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import nourl.mythicmetals.MythicMetals;

@Config(name = MythicMetals.MOD_ID)
public class MythicConfig implements ConfigData {
    @ConfigEntry.Gui.RequiresRestart

    public boolean enableDusts = false;
    public boolean enableNuggets = true;

    public int configVersion = 0;

    //Adamantite Ore Settings
    @ConfigEntry.Gui.CollapsibleObject
    public OreConfig adamantite = new OreConfig(true, 5, 1, -56, 8, .2f);

    //Aetherium Ore Settings
    public boolean oreAetheriumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreAetheriumVeinSize = 4;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreAetheriumPerChunk = 3;
    public int oreAetheriumMinHeight = 80;
    public int oreAetheriumTopOffset = 60;

    //Aquarium Ore Settings
    public boolean oreAquariumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreAquariumVeinSize = 9;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreAquariumPerChunk = 4;
    public int oreAquariumMinHeight = 30;
    public int oreAquariumMaxHeight = 63;

    //Banglum Ore Settings
    public boolean oreBanglumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreBanglumVeinSize = 6;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreBanglumPerChunk = 4;
    public int oreBanglumMinHeight = 38;
    public int oreBanglumMaxHeight = 52;

    //Carmot Ore Settings
    public boolean oreCarmotGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreCarmotVeinSize = 4;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreCarmotPerChunk = 3;
    public int oreCarmotMinHeight = 16;
    public int oreCarmotMaxHeight = 32;

    //Kyber Ore Settings
    public boolean oreKyberGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreKyberVeinSize = 3;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreKyberPerChunk = 1;
    public int oreKyberMinHeight = 12;
    public int oreKyberMaxHeight = 40;

    //Manganese Ore Settings
    public boolean oreManganeseGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreManganeseVeinSize = 9;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreManganesePerChunk = 2;
    public int oreManganeseMinHeight = 28;
    public int oreManganeseMaxHeight = 48;

    //Midas Gold Ore Settings
    public boolean oreMidasGoldGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreMidasgoldVeinSize = 6;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreMidasgoldPerChunk = 7;
    public int oreMidasgoldMinHeight = 10;
    public int oreMidasgoldMaxHeight = 128;

    //Mythril Ore Settings
    public boolean oreMythrilGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreMythrilVeinSize = 4;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreMythrilPerChunk = 1;
    public int oreMythrilMinHeight = -36;
    public int oreMythrilMaxHeight = 16;

    //Orichalcum Ore Settings
    public boolean oreOrichalcumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreOrichalcumVeinSize = 4;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreOrichalcumPerChunk = 1;
    public int oreOrichalcumBottomOffset = 8;
    public int oreOrichalcumMaxHeight = 24;

    //Osmium Ore Settings
    public boolean oreOsmiumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreOsmiumVeinSize = 6;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreOsmiumPerChunk = 5;
    public int oreOsmiumMinHeight = 20;
    public int oreOsmiumMaxHeight = 40;

    //Palladium Ore Settings
    public boolean orePalladiumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int orePalladiumVeinSize = 4;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int orePalladiumPerChunk = 6;
    public int orePalladiumMinHeight = 16;
    public int orePalladiumMaxHeight = 40;

    //Platinum Ore Settings
    public boolean orePlatinumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int orePlatinumVeinSize = 6;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int orePlatinumPerChunk = 2;
    public int orePlatinumMinHeight = 8;
    public int orePlatinumMaxHeight = 32;

    //Prometheum Ore Settings
    public boolean orePrometheumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int orePrometheumVeinSize = 6;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int orePrometheumPerChunk = 4;
    public int orePrometheumBottomOffset = 30;
    public int orePrometheumMaxHeight = 48;

    //Quadrillum Ore Settings
    public boolean oreQuadrillumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreQuadrillumVeinSize = 7;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreQuadrillumPerChunk = 2;
    public int oreQuadrillumMinHeight = 16;
    public int oreQuadrillumMaxHeight = 44;

    //Runite Ore Settings
    public boolean oreRuniteGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreRuniteVeinSize = 3;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreRunitePerChunk = 2;
    public int oreRuniteMinHeight = 9;
    public int oreRuniteMaxHeight = 39;

    //Silver Ore Settings
    public boolean oreSilverGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreSilverVeinSize = 8;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreSilverPerChunk = 4;
    public int oreSilverMinHeight = 6;
    public int oreSilverMaxHeight = 28;

    //Starrite Ore Settings
    public boolean oreStarriteGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreStarriteVeinSize = 3;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreStarritePerChunk = 1;
    public int oreStarriteMinHeight = 50;
    public int oreStarriteTopOffset = 100;

    //Stormyx Ore Settings
    public boolean oreStormyxGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreStormyxVeinSize = 8;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreStormyxPerChunk = 2;
    public int oreStormyxMinHeight = 4;
    public int oreStormyxMaxHeight = 116;

    //Tin Ore Settings
    public boolean oreTinGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreTinVeinSize = 8;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreTinPerChunk = 4;
    public int oreTinMinHeight = 44;
    public int oreTinMaxHeight = 72;


    //Unobtainium Ore Settings
    public boolean oreUnobtainiumGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreUnobtainiumVeinSize = 3;
    public int oreUnobtainiumMinHeight = -60;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreUnobtainiumMaxHeight = 12;
    public float oreUnobtainiumDiscardChance = 0.5F;

    //Vermiculite Ore Settings
    public boolean oreVermiculiteGeneration = true;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreVermiculiteVeinSize = 8;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    public int oreVermiculitePerChunk = 4;
    public int oreVermiculiteMinHeight = 64;
    public int oreVermiculiteMaxHeight = 108;
}

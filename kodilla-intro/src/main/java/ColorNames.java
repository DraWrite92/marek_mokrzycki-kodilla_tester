public class ColorNames {
    public String describeColor() {
        String userColor = Colors.getColorLetter();
        String result = null;
        switch(userColor) {
            case "AC":
                result = "Alabaster, Almond, Amaranth, Amber, Amethyst, Apricot, Aquamarine, Asparagus, Auburn, Azure";
                break;
            case "BC":
                result = "Beige, Black, Blue, Blush, Bone, Bronze, Brown, Buff, Burgundy, Butterscotch";
                break;
            case "CC":
                result = "Canary, Celadon, Celeste, Cerise, Charcoal, Cinereous, Coral, Cream, Crimson, Cyan";
                break;
            case "DC":
                result = "Denim, Dun";
                break;
            case "EC":
                result = "Ebony, Ecru, Eggplant, Emerald";
                break;
            case "FC":
                result = "Fandango, Fawn, Feldgrau, Flame, Flax, Folly, Fuchsia, Fulvous";
                break;
            case "GC":
                result = "Gamboge, Glaucous, Gold, Goldenrod, Grape, Green, Grey, Gunmetal";
                break;
            case "HC":
                result = "Harlequin, Heliotrope, Honeydew";
                break;
            case "IC":
                result = "Icterine, Indigo, Iris, Ivory";
                break;
            case "JC":
                result = "Jade, Jasmine, Jasper, Jet, Jonquil";
                break;
            case "KC":
                result = "Khaki, Kobicha";
                break;
            case "LC":
                result = "Lapis Lazuli, Lavender, Licorice, Lilac, Lime, Linen, Lion, Liver";
                break;
            case "MC":
                result = "Malachite, Mint, Maize, Mustard, Mahogany, Maroon, Magenta, Mulberry, Magnolia, Mauve(ine)";
                break;
            case "NC":
                result = "Navy, Night, Nyanza";
                break;
            case "OC":
                result = "Ochre, Olive, Olivine, Onyx, Orchid";
                break;
            case "PC":
                result = "Parchment, Peach, Pearl, Periwinkle, Persimmon, Pink, Pistachio, Platinum, Plum, Purple";
                break;
            case "QC":
                result = "Quinacridone";
                break;
            case "RC":
                result = "Raspberry, Razzmatazz, Red, Redwood, Rose, Rust";
                break;
            case "SC":
                result = "Saffron, Sage, Salmon, Sand, Sapphire, Scarlet, Seashell, Sepia, Sienna, Silver";
                break;
            case "TC":
                result = "Tan, Tangerine, Taupe, Tawny, Teal, Tekhelet, Thistle, Timberwolf, Tomato, Turquoise";
                break;
            case "UC":
                result = "Ultramarine, Umber";
                break;
            case "VC":
                result = "Vanilla, Verdigris, Vermilion, Violet, Viridian";
                break;
            case "WC":
                result = "Walnut, Wheat, White, Wine, Wisteria";
                break;
            case "XC":
                result = "Xanthous";
                break;
            case "YC":
                result = "Yellow";
                break;
            case "ZC":
                result = "Zomp";
                break;
        }
        return result;

        // Thanks to Wikipedia for the names of the different color shades!
    }
}

package imageviewer.persistence.files;

import imageviewer.model.Image;
import imageviewer.persistence.ImageLoader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebImageLoader implements ImageLoader {

    private String[] images;
    
    public WebImageLoader(String text) {
        this.images = extractURIs(search(text));
    }

    @Override
    public Image load() {
        return imageAt(0);
    }

    private String search(String text) {
        return "{\n" +
"  \"result_count\": 239894,\n" +
"  \"images\": [\n" +
"    {\n" +
"      \"id\": \"556268385\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/556268385.jpg?v=1&g=fs1|0|FKF|68|385&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/waiting-for-food-royalty-free-image/556268385\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Waiting for food\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"571398515\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/571398515.jpg?v=1&g=fs1|0|FKF|98|515&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/teddy-bear-royalty-free-image/571398515\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Teddy bear\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"674480291\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/674480291.jpg?v=1&g=fs1|0|EYM|80|291&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/close-up-of-brown-bear-in-lake-royalty-free-image/674480291\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Close-Up Of Brown Bear In Lake\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"673490005\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/673490005.jpg?v=1&g=fs1|0|EYM|90|005&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/high-angle-view-of-bear-in-water-royalty-free-image/673490005\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"High Angle View Of Bear In Water\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"539492670\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/539492670.jpg?v=1&g=fs1|0|FKF|92|670&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/polar-bear-headshot-detailed-view-ursus-maritimus-royalty-free-image/539492670\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Polar bear headshot. Detailed view. Ursus maritimus\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"171949168\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/171949168.jpg?v=1&g=fs1|0|FKF|49|168&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/oso-pardo-royalty-free-image/171949168\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Oso Pardo\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"170131313\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/170131313.jpg?v=1&g=fs1|0|PLB|31|313&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/madrid-bear-statue-in-puerta-del-sol-high-res-stock-photography/170131313\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Madrid, Bear Statue in Puerta del Sol\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"518282837\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/518282837.jpg?v=1&g=fs1|0|TSIR|82|837&s=1&b=NUI1\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/grizzly-bear-high-res-stock-photography/518282837\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Grizzly Bear\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"495609571\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/495609571.jpg?v=1&g=fs1|0|SKP223|09|571&s=1&b=RDAx\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-photo-the-statue-of-the-bear-and-the-strawberry-tree/495609571\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/photo/the-statue-of-the-bear-and-the-strawberry-tree-gm495609571-40944058\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"La Estatua del oso y el árbol de fresa\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"161939671\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/161939671.jpg?v=1&g=fs1|0|TSIR|39|671&s=1&b=NDJC\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/polar-bear-high-res-stock-photography/161939671\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Polar Bear\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"79194039\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/79194039.jpg?v=1&g=fs1|0|GLW|94|039&s=1&b=RTRE\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/close-up-of-a-statue-of-a-bear-and-a-madrona-tree-royalty-free-image/79194039\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Close-up of a statue of a bear and a Madrona tree, Puerto De Sol, Madrid, Spain\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"614982914\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/614982914.jpg?v=1&g=fs1|0|SKP383|82|914&s=1&b=RTQ1\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-illustration-bear-face-on-flowers/614982914\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/bear-face-on-flowers-gm614982914-106580127\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Bear face on flowers\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"585604946\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/585604946.jpg?v=1&g=fs1|0|SKP344|04|946&s=1&b=QjFE\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-illustration-smiling-brown-bear/585604946\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/smiling-brown-bear-gm585604946-100465353\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Sonriendo brown bear\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"500565090\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/500565090.jpg?v=1&g=fs1|0|SKP230|65|090&s=1&b=RTcz\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-photo-bear-isolated-on-white-background/500565090\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/photo/bear-isolated-on-white-background-gm500565090-80835205\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Bear aislado sobre fondo blanco\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"466072160\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/466072160.jpg?v=1&g=fs1|0|ISE|72|160&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/photo/the-statue-of-bear-and-strawberry-tree-in-madrid-spain-gm466072160-55053190\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"La Estatua del oso y fresas árbol en Madrid, España\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"494437142\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/494437142.jpg?v=1&g=fs1|0|SKP222|37|142&s=1&b=RTk5\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-photo-brown-bear/494437142\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/photo/brown-bear-gm494437142-77440957\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Brown oso\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"518282835\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/518282835.jpg?v=1&g=fs1|0|TSIR|82|835&s=1&b=NUZB\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/grizzly-bear-high-res-stock-photography/518282835\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Grizzly Bear\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"524158962\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/524158962.jpg?v=1&g=fs1|0|SKP262|58|962&s=1&b=OTYy\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-illustration-claws-scratching-animal/524158962\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/claws-scratching-animal-gm524158962-92147007\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Ganchos Rasguños de animales\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"499803796\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache4.asset-cache.net/xt/499803796.jpg?v=1&g=fs1|0|SKP229|03|796&s=1&b=M0Mx\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-illustration-vintage-bear-with-slogan-and-sunbursts/499803796\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/vintage-bear-with-slogan-and-sunbursts-gm499803796-80442511\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Vintage bear con el eslogan y sunbursts.\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"543226991\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/543226991.jpg?v=1&g=fs1|0|EYM|26|991&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/close-up-of-grizzly-bear-royalty-free-image/543226991\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Close-Up Of Grizzly Bear\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"132312718\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/132312718.jpg?v=1&g=fs1|0|PC|12|718&s=1&b=RTRE\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/bear-statue-puerta-del-sol-madrid-spain-high-res-stock-photography/132312718\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"bear Statue, Puerta del Sol, Madrid, Spain\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"138743471\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/138743471.jpg?v=1&g=fs1|0|FKM|43|471&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/brown-bear-high-res-stock-photography/138743471\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Brown bear\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"544507317\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache3.asset-cache.net/xt/544507317.jpg?v=1&g=fs1|0|NGF|07|317&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/female-grizzly-bear-stands-in-the-evening-light-royalty-free-image/544507317\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"A female grizzly bear stands in the evening light.\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"610225364\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/610225364.jpg?v=1&g=fs1|0|SKP377|25|364&s=1&b=RDc5\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-illustration-polar-bear-polygon-blue-silhouette/610225364\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/polar-bear-polygon-blue-silhouette-vector-illustration-gm610225364-104702535\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"polar bear polygon blue silhouette, vector illustration\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"600393332\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/600393332.jpg?v=1&g=fs1|0|SKP364|93|332&s=1&b=NzEw\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"thinkstock\",\n" +
"          \"uri\": \"http://www.thinkstockphotos.com/image/stock-illustration-hand-drawn-dancing-bear/600393332\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/hand-drawn-dancing-bear-gm600393332-103249957\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Hand drawn dancing bear.\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"481089853\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/481089853.jpg?v=1&g=fs1|0|FKF|89|853&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/my-brother-royalty-free-image/481089853\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"my brother\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"671681525\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/671681525.jpg?v=1&g=fs1|0|APC|81|525&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/bear-sitting-on-stone-high-res-stock-photography/671681525\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \" Bear Sitting On Stone\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"544507265\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache1.asset-cache.net/xt/544507265.jpg?v=1&g=fs1|0|NGF|07|265&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/photo/bear-reflects-as-it-walks-the-shallow-tidal-water-royalty-free-image/544507265\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"A bear reflects as it walks the shallow tidal water.\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"532934393\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache2.asset-cache.net/xt/532934393.jpg?v=1&g=fs1|0|ISI|34|393&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/illustration/pack-bears-royalty-free-illustration/532934393\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/pack-bears-gm532934393-56252236\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Paquete bears\"\n" +
"    },\n" +
"    {\n" +
"      \"id\": \"489735670\",\n" +
"      \"display_sizes\": [\n" +
"        {\n" +
"          \"is_watermarked\": false,\n" +
"          \"name\": \"thumb\",\n" +
"          \"uri\": \"http://cache4.asset-cache.net/xt/489735670.jpg?v=1&g=fs1|0|ISI|35|670&s=1&b=RjI4\"\n" +
"        }\n" +
"      ],\n" +
"      \"referral_destinations\": [\n" +
"        {\n" +
"          \"site_name\": \"gettyimages\",\n" +
"          \"uri\": \"http://www.gettyimages.com/detail/illustration/brown-bear-badge-emblem-design-royalty-free-illustration/489735670\"\n" +
"        },\n" +
"        {\n" +
"          \"site_name\": \"istockphoto\",\n" +
"          \"uri\": \"http://www.istockphoto.com/vector/brown-bear-badge-emblem-design-gm489735670-74822841\"\n" +
"        }\n" +
"      ],\n" +
"      \"title\": \"Brown Bear emblema de diseño de tarjeta\"\n" +
"    }\n" +
"  ]\n" +
"}";
    }

    private String[] extractURIs(String text) {
        String uri = "\"uri\": \"";
        String[] split = text.split(uri);
        String[] result = new String[split.length/2];
        for (int i = 0; i < result.length; i++) {
            String line = split[i*2+1];
            result[i] = line.substring(0, line.indexOf("\""));
        }
        return result;
    }

    private Image imageAt(final int index) {
        return new Image() {

            @Override
            public InputStream inputStream() {
                try {
                    return new URL(images[index]).openStream();
                } 
                catch (IOException ex) {
                    return null;
                }
            }

            @Override
            public Image prev() {
                if (index == 0) return imageAt(images.length-1);
                return imageAt(index-1);
            }

            @Override
            public Image next() {
                if (index == images.length-1) return imageAt(0);
                return imageAt(index+1);
            }
        };
    }
    
}

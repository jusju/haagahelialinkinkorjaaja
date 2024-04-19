import java.util.Scanner;

public class LinkinKorjaaja {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna puhdistettava linkki: ");
        String hajotettuLinkki = lukija.nextLine();

        String[] olennaisetOsatUrlPropsi = hajotettuLinkki.split("\\?url=");
        String[] olennaisetOsatDataPropsi =  olennaisetOsatUrlPropsi[1].split("\\&data=");

        String urlOsittainPuhdistettu = olennaisetOsatDataPropsi[0];
        String kauttaMerkitKorjattu = urlOsittainPuhdistettu.replace("%2F", "/");
        System.out.println(kauttaMerkitKorjattu); 
        String kaksoisPisteKorjattu = kauttaMerkitKorjattu.replace("%3A", ":");
        System.out.println("Korjattu hyperlinkki: " + kaksoisPisteKorjattu);
    }
}


//Testi URL: https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fwww.cs.hut.fi%2F~jtjuslin%2Fjuslin-thesis-hutcs-final.pdf&data=05%7C02%7CTeemu.Havulinna%40haaga-helia.fi%7C7b91b998a424408929f108dc5f998957%7Ca9e39483dd214c25b8482a625cff7939%7C0%7C0%7C638490360233624482%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=Y0ZMDLxtKilYjnGQV1Xc9o6w%2F2v7jVYj1pBfxT98Iqk%3D&reserved=0


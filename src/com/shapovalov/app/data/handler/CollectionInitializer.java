package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;


public class CollectionInitializer {

    public void initialize(JSONObject JSONObject) {

        //stumb(JSONObject);

        fill();
    }

    private void fill() {

        Countries.countries.add(	new Country(	1	,	"	Afghanistan	"	,	39835428	,	652230	,	20116137326L	));
        Countries.countries.add(	new Country(	2	,	"	Albania	"	,	2811666	,	27400	,	18260043500L	));
        Countries.countries.add(	new Country(	3	,	"	Algeria	"	,	44616626	,	2381741	,	167983000000L	));
        Countries.countries.add(	new Country(	4	,	"	Andorra	"	,	77354	,	470	,	3329910724L	));
        Countries.countries.add(	new Country(	5	,	"	Angola	"	,	33933611	,	1246700	,	72546985709L	));
        Countries.countries.add(	new Country(	6	,	"	Antigua and Barbuda	"	,	98728	,	440	,	1471125926L	));
        Countries.countries.add(	new Country(	7	,	"	Argentina	"	,	45808747	,	2736690	,	491493000000L	));
        Countries.countries.add(	new Country(	8	,	"	Armenia	"	,	2968128	,	28470	,	13861183874L	));
        Countries.countries.add(	new Country(	9	,	"	Australia	"	,	25739256	,	7692020	,	1542660000000L	));
        Countries.countries.add(	new Country(	10	,	"	Austria	"	,	8956279	,	82520	,	477082000000L	));
        Countries.countries.add(	new Country(	11	,	"	Azerbaijan	"	,	10145212	,	82646	,	54622176471L	));
        Countries.countries.add(	new Country(	12	,	"	Bahamas	"	,	396914	,	10010	,	11208600000L	));
        Countries.countries.add(	new Country(	13	,	"	Bahrain	"	,	1748295	,	785	,	38868663032L	));
        Countries.countries.add(	new Country(	14	,	"	Bangladesh	"	,	166303494	,	130170	,	416265000000L	));
        Countries.countries.add(	new Country(	15	,	"	Barbados	"	,	287708	,	430	,	4900800000L	));
        Countries.countries.add(	new Country(	16	,	"	Belarus	"	,	9340314	,	202980	,	68218816484L	));
        Countries.countries.add(	new Country(	17	,	"	Belgium	"	,	11587882	,	30280	,	599879000000L	));
        Countries.countries.add(	new Country(	18	,	"	Belize	"	,	404915	,	22810	,	1789923264L	));
        Countries.countries.add(	new Country(	19	,	"	Benin	"	,	12451031	,	112760	,	17785640079L	));
        Countries.countries.add(	new Country(	20	,	"	Bhutan	"	,	779900	,	38140	,	2315436303L	));
        Countries.countries.add(	new Country(	21	,	"	Bolivia	"	,	11832936	,	1083300	,	40408208524L	));
        Countries.countries.add(	new Country(	22	,	"	Bosnia and Herzegovina	"	,	3263459	,	51200	,	22571512867L	));
        Countries.countries.add(	new Country(	23	,	"	Botswana	"	,	2397240	,	566730	,	17613846473L	));
        Countries.countries.add(	new Country(	24	,	"	Brazil	"	,	213993441	,	8358140	,	1608980000000L	));
        Countries.countries.add(	new Country(	25	,	"	Brunei Darussalam	"	,	441532	,	5270	,	14006569576L	));
        Countries.countries.add(	new Country(	26	,	"	Bulgaria	"	,	6899125	,	108560	,	80271119426L	));
        Countries.countries.add(	new Country(	27	,	"	Burkina Faso	"	,	21497097	,	273600	,	19737615114L	));
        Countries.countries.add(	new Country(	28	,	"	Burundi	"	,	12255429	,	25680	,	2902029386L	));
        Countries.countries.add(	new Country(	29	,	"	Cabo Verde	"	,	561901	,	4030	,	1936174043L	));
        Countries.countries.add(	new Country(	30	,	"	Cambodia	"	,	16946446	,	176520	,	26961061120L	));
        Countries.countries.add(	new Country(	31	,	"	Cameroon	"	,	27224262	,	472710	,	45238613480L	));
        Countries.countries.add(	new Country(	32	,	"	Canada	"	,	38246108	,	8965590	,	1990760000000L	));
        Countries.countries.add(	new Country(	33	,	"	Central African Republic	"	,	4919987	,	622980	,	2516498299L	));
        Countries.countries.add(	new Country(	34	,	"	Chad	"	,	16914985	,	1259200	,	11779980802L	));
        Countries.countries.add(	new Country(	35	,	"	Chile	"	,	19212362	,	743532	,	317059000000L	));
        Countries.countries.add(	new Country(	36	,	"	China	"	,	1412360000	,	9424703	,	17734100000000L	));
        Countries.countries.add(	new Country(	37	,	"	Colombia	"	,	51265841	,	1109500	,	314322000000L	));
        Countries.countries.add(	new Country(	38	,	"	Comoros	"	,	888456	,	1861	,	1327964249L	));
        Countries.countries.add(	new Country(	39	,	"	Congo (Democratic Republic)	"	,	92377986	,	2267050	,	53958573693L	));
        Countries.countries.add(	new Country(	40	,	"	Congo (Republic)	"	,	5657017	,	341500	,	12523961677L	));
        Countries.countries.add(	new Country(	41	,	"	Costa Rica	"	,	5139053	,	51060	,	64282438667L	));
        Countries.countries.add(	new Country(	42	,	"	Cote d'Ivoire	"	,	27053629	,	318000	,	69764827467L	));
        Countries.countries.add(	new Country(	43	,	"	Croatia	"	,	3899000	,	55960	,	67837788544L	));
        Countries.countries.add(	new Country(	44	,	"	Cuba	"	,	11317498	,	103800	,	107352000000L	));
        Countries.countries.add(	new Country(	45	,	"	Cyprus	"	,	1215588	,	9240	,	27719337670L	));
        Countries.countries.add(	new Country(	46	,	"	Czechia	"	,	10703446	,	77199	,	282341000000L	));
        Countries.countries.add(	new Country(	47	,	"	Denmark	"	,	5856733	,	40000	,	397104000000L	));
        Countries.countries.add(	new Country(	48	,	"	Djibouti	"	,	1002197	,	23180	,	3371102124L	));
        Countries.countries.add(	new Country(	49	,	"	Dominica	"	,	72172	,	750	,	545618519L	));
        Countries.countries.add(	new Country(	50	,	"	Dominican Republic	"	,	10953714	,	48310	,	94243453937L	));
        Countries.countries.add(	new Country(	51	,	"	Ecuador	"	,	17888474	,	248360	,	106166000000L	));
        Countries.countries.add(	new Country(	52	,	"	Egypt	"	,	104258327	,	995450	,	404143000000L	));
        Countries.countries.add(	new Country(	53	,	"	El Salvador	"	,	6518500	,	20720	,	28736940000L	));
        Countries.countries.add(	new Country(	54	,	"	Equatorial Guinea	"	,	1449891	,	28050	,	12269392789L	));
        Countries.countries.add(	new Country(	55	,	"	Eritrea	"	,	6209262	,	121041	,	40L	));
        Countries.countries.add(	new Country(	56	,	"	Estonia	"	,	1329254	,	42750	,	36262924354L	));
        Countries.countries.add(	new Country(	57	,	"	Eswatini	"	,	1172369	,	17200	,	4941373182L	));
        Countries.countries.add(	new Country(	58	,	"	Ethiopia	"	,	117876226	,	1128571	,	111271000000L	));
        Countries.countries.add(	new Country(	59	,	"	Fiji	"	,	902899	,	18270	,	4592118710L	));
        Countries.countries.add(	new Country(	60	,	"	Finland	"	,	5541696	,	303940	,	299155000000L	));
        Countries.countries.add(	new Country(	61	,	"	France	"	,	67499343	,	547557	,	2937470000000L	));
        Countries.countries.add(	new Country(	62	,	"	Gabon	"	,	2278829	,	257670	,	18269350434L	));
        Countries.countries.add(	new Country(	63	,	"	Gambia	"	,	2486937	,	10120	,	2078070684L	));
        Countries.countries.add(	new Country(	64	,	"	Georgia	"	,	3708610	,	69490	,	18700241392L	));
        Countries.countries.add(	new Country(	65	,	"	Germany	"	,	83129285	,	349390	,	4223120000000L	));
        Countries.countries.add(	new Country(	66	,	"	Ghana	"	,	31732128	,	227533	,	77594279055L	));
        Countries.countries.add(	new Country(	67	,	"	Great Britian	"	,	67326569	,	241930	,	3186860000000L	));
        Countries.countries.add(	new Country(	68	,	"	Greece	"	,	10664568	,	128900	,	216241000000L	));
        Countries.countries.add(	new Country(	69	,	"	Grenada	"	,	113015	,	340	,	1122083185L	));
        Countries.countries.add(	new Country(	70	,	"	Guatemala	"	,	17109746	,	107160	,	85986321551L	));
        Countries.countries.add(	new Country(	71	,	"	Guinea	"	,	13497237	,	245720	,	15850520384L	));
        Countries.countries.add(	new Country(	72	,	"	Guinea-Bissau	"	,	2015490	,	28120	,	1638517533L	));
        Countries.countries.add(	new Country(	73	,	"	Guyana	"	,	790329	,	196850	,	7409179921L	));
        Countries.countries.add(	new Country(	74	,	"	Haiti	"	,	11541683	,	27560	,	20944392615L	));
        Countries.countries.add(	new Country(	75	,	"	Honduras	"	,	10062994	,	111890	,	28488668302L	));
        Countries.countries.add(	new Country(	76	,	"	Hungary	"	,	9709886	,	91260	,	182281000000L	));
        Countries.countries.add(	new Country(	77	,	"	Iceland	"	,	372295	,	100830	,	25458933916L	));
        Countries.countries.add(	new Country(	78	,	"	India	"	,	1393409033	,	2973190	,	3173400000000L	));
        Countries.countries.add(	new Country(	79	,	"	Indonesia	"	,	276361788	,	1877519	,	1186090000000L	));
        Countries.countries.add(	new Country(	80	,	"	Iran	"	,	85028760	,	1622500	,	231547571240L	));
        Countries.countries.add(	new Country(	81	,	"	Iraq	"	,	41179351	,	434128	,	207889000000L	));
        Countries.countries.add(	new Country(	82	,	"	Ireland	"	,	5028230	,	68890	,	498560000000L	));
        Countries.countries.add(	new Country(	83	,	"	Israel	"	,	9364000	,	21640	,	481591000000L	));
        Countries.countries.add(	new Country(	84	,	"	Italy	"	,	59066225	,	295717	,	2099880000000L	));
        Countries.countries.add(	new Country(	85	,	"	Jamaica	"	,	2973462	,	10830	,	13638230996L	));
        Countries.countries.add(	new Country(	86	,	"	Japan	"	,	125681593	,	364500	,	4937420000000L	));
        Countries.countries.add(	new Country(	87	,	"	Jordan	"	,	10269022	,	88794	,	45243661972L	));
        Countries.countries.add(	new Country(	88	,	"	Kazakhstan	"	,	19002586	,	2699700	,	190814000000L	));
        Countries.countries.add(	new Country(	89	,	"	Kenya	"	,	54985702	,	569140	,	110347000000L	));
        Countries.countries.add(	new Country(	90	,	"	Kiribati	"	,	121388	,	810	,	180911844L	));
        Countries.countries.add(	new Country(	91	,	"	Korea (North)	"	,	25887045	,	120410	,	40L	));
        Countries.countries.add(	new Country(	92	,	"	Korea (South)	"	,	51744876	,	97600	,	1798530000000L	));
        Countries.countries.add(	new Country(	93	,	"	Kuwait	"	,	4328553	,	17820	,	105960225688L	));
        Countries.countries.add(	new Country(	94	,	"	Kyrgyzstan	"	,	6694200	,	191800	,	8543423503L	));
        Countries.countries.add(	new Country(	95	,	"	Lao PDR	"	,	7379358	,	230800	,	18827148530L	));
        Countries.countries.add(	new Country(	96	,	"	Latvia	"	,	1883162	,	62230	,	38872546229L	));
        Countries.countries.add(	new Country(	97	,	"	Lebanon	"	,	6769151	,	10230	,	18076624840L	));
        Countries.countries.add(	new Country(	98	,	"	Lesotho	"	,	2159067	,	30360	,	2518468891L	));
        Countries.countries.add(	new Country(	99	,	"	Liberia	"	,	5180208	,	96320	,	3486741370L	));
        Countries.countries.add(	new Country(	100	,	"	Libya	"	,	6958538	,	1759540	,	41879579677L	));
        Countries.countries.add(	new Country(	101	,	"	Liechtenstein	"	,	38254	,	160	,	6427248943L	));
        Countries.countries.add(	new Country(	102	,	"	Lithuania	"	,	2795321	,	62620	,	65503849705L	));
        Countries.countries.add(	new Country(	103	,	"	Luxembourg	"	,	639070	,	2574	,	86710803337L	));
        Countries.countries.add(	new Country(	104	,	"	Madagascar	"	,	28427333	,	581800	,	14637400396L	));
        Countries.countries.add(	new Country(	105	,	"	Malawi	"	,	19647681	,	94280	,	12626718074L	));
        Countries.countries.add(	new Country(	106	,	"	Malaysia	"	,	32776195	,	328550	,	372701000000L	));
        Countries.countries.add(	new Country(	107	,	"	Maldives	"	,	543620	,	300	,	4889666932L	));
        Countries.countries.add(	new Country(	108	,	"	Mali	"	,	20855724	,	1220190	,	19143741503L	));
        Countries.countries.add(	new Country(	109	,	"	Malta	"	,	516869	,	320	,	17189730470L	));
        Countries.countries.add(	new Country(	110	,	"	Marshall Islands	"	,	59618	,	180	,	248665600L	));
        Countries.countries.add(	new Country(	111	,	"	Mauritania	"	,	4775110	,	1030700	,	8227580740L	));
        Countries.countries.add(	new Country(	112	,	"	Mauritius	"	,	1266060	,	2030	,	11156657770L	));
        Countries.countries.add(	new Country(	113	,	"	Mexico	"	,	130262220	,	1943950	,	1293040000000L	));
        Countries.countries.add(	new Country(	114	,	"	Micronesia	"	,	116255	,	700	,	404178050L	));
        Countries.countries.add(	new Country(	115	,	"	Moldova	"	,	2573928	,	32885	,	13679221333L	));
        Countries.countries.add(	new Country(	116	,	"	Monaco	"	,	39520	,	2	,	6816219303L	));
        Countries.countries.add(	new Country(	117	,	"	Mongolia	"	,	3329282	,	1557507	,	15098022829L	));
        Countries.countries.add(	new Country(	118	,	"	Montenegro	"	,	620173	,	13450	,	5809170962L	));
        Countries.countries.add(	new Country(	119	,	"	Morocco	"	,	37344787	,	446300	,	132725000000L	));
        Countries.countries.add(	new Country(	120	,	"	Mozambique	"	,	32163045	,	786380	,	16095828897L	));
        Countries.countries.add(	new Country(	121	,	"	Myanmar	"	,	54806014	,	652670	,	65067808985L	));
        Countries.countries.add(	new Country(	122	,	"	Namibia	"	,	2587344	,	823290	,	12236250784L	));
        Countries.countries.add(	new Country(	123	,	"	Nauru	"	,	10873	,	20	,	133218897L	));
        Countries.countries.add(	new Country(	124	,	"	Nepal	"	,	29674920	,	143350	,	36288830373L	));
        Countries.countries.add(	new Country(	125	,	"	Netherlands	"	,	17533405	,	33670	,	1018010000000L	));
        Countries.countries.add(	new Country(	126	,	"	New Zealand	"	,	5122600	,	263310	,	249992000000L	));
        Countries.countries.add(	new Country(	127	,	"	Nicaragua	"	,	6702379	,	120340	,	14013022092L	));
        Countries.countries.add(	new Country(	128	,	"	Niger	"	,	25130810	,	1266700	,	14950949875L	));
        Countries.countries.add(	new Country(	129	,	"	Nigeria	"	,	211400704	,	910770	,	440777000000L	));
        Countries.countries.add(	new Country(	130	,	"	North Macedonia	"	,	2065092	,	25220	,	13879269152L	));
        Countries.countries.add(	new Country(	131	,	"	Norway	"	,	5408320	,	364285	,	482437000000L	));
        Countries.countries.add(	new Country(	132	,	"	Oman	"	,	5223376	,	309500	,	85868626528L	));
        Countries.countries.add(	new Country(	133	,	"	Pakistan	"	,	225199929	,	770880	,	346343000000L	));
        Countries.countries.add(	new Country(	134	,	"	Palau	"	,	18174	,	460	,	257700000L	));
        Countries.countries.add(	new Country(	135	,	"	Panama	"	,	4381583	,	74180	,	63605065800L	));
        Countries.countries.add(	new Country(	136	,	"	Papua New Guinea	"	,	9119005	,	452860	,	26594277246L	));
        Countries.countries.add(	new Country(	137	,	"	Paraguay	"	,	7219641	,	397300	,	38986810989L	));
        Countries.countries.add(	new Country(	138	,	"	Peru	"	,	33359416	,	1280000	,	223249000000L	));
        Countries.countries.add(	new Country(	139	,	"	Philippines	"	,	111046910	,	298170	,	394086000000L	));
        Countries.countries.add(	new Country(	140	,	"	Poland	"	,	37781024	,	306130	,	674048000000L	));
        Countries.countries.add(	new Country(	141	,	"	Portugal	"	,	10299423	,	91606	,	249886000000L	));
        Countries.countries.add(	new Country(	142	,	"	Qatar	"	,	2930524	,	11490	,	179571000000L	));
        Countries.countries.add(	new Country(	143	,	"	Romania	"	,	19115146	,	230080	,	284088000000L	));
        Countries.countries.add(	new Country(	144	,	"	Russia	"	,	143446060	,	16376870	,	1775800000000L	));
        Countries.countries.add(	new Country(	145	,	"	Rwanda	"	,	13276517	,	24670	,	11070356519L	));
        Countries.countries.add(	new Country(	146	,	"	Saint Kitts and Nevis	"	,	53546	,	260	,	976150667L	));
        Countries.countries.add(	new Country(	147	,	"	Saint Lucia	"	,	184401	,	610	,	1764901133L	));
        Countries.countries.add(	new Country(	148	,	"	Saint Vincent and the Grenadines	"	,	111269	,	390	,	889775243L	));
        Countries.countries.add(	new Country(	149	,	"	Samoa	"	,	200144	,	2780	,	788389972L	));
        Countries.countries.add(	new Country(	150	,	"	San Marino	"	,	34010	,	60	,	1544713785L	));
        Countries.countries.add(	new Country(	151	,	"	Sao Tome and Principe	"	,	223364	,	960	,	547092915L	));
        Countries.countries.add(	new Country(	152	,	"	Saudi Arabia	"	,	35340680	,	2149690	,	833541000000L	));
        Countries.countries.add(	new Country(	153	,	"	Senegal	"	,	17196308	,	192530	,	27625388352L	));
        Countries.countries.add(	new Country(	154	,	"	Serbia	"	,	6844078	,	87460	,	63068134601L	));
        Countries.countries.add(	new Country(	155	,	"	Seychelles	"	,	99202	,	460	,	1320053793L	));
        Countries.countries.add(	new Country(	156	,	"	Sierra Leone	"	,	8141343	,	72180	,	4200380124L	));
        Countries.countries.add(	new Country(	157	,	"	Singapore	"	,	5453566	,	718	,	396987000000L	));
        Countries.countries.add(	new Country(	158	,	"	Slovakia	"	,	5447247	,	48080	,	114871000000L	));
        Countries.countries.add(	new Country(	159	,	"	Slovenia	"	,	2107007	,	20136	,	61526331889L	));
        Countries.countries.add(	new Country(	160	,	"	Solomon Islands	"	,	703995	,	27990	,	1645213882L	));
        Countries.countries.add(	new Country(	161	,	"	Somalia	"	,	16359500	,	627340	,	7292721820L	));
        Countries.countries.add(	new Country(	162	,	"	South Africa	"	,	60041996	,	1213090	,	419946428126L	));
        Countries.countries.add(	new Country(	163	,	"	South Sudan	"	,	11381377	,	631930	,	11997800760L	));
        Countries.countries.add(	new Country(	164	,	"	Spain	"	,	47326687	,	499557	,	1425280000000L	));
        Countries.countries.add(	new Country(	165	,	"	Sri Lanka	"	,	22156000	,	61860	,	84518830393L	));
        Countries.countries.add(	new Country(	166	,	"	Sudan	"	,	44909351	,	1868000	,	34326058557L	));
        Countries.countries.add(	new Country(	167	,	"	Suriname	"	,	591798	,	156000	,	2862131980L	));
        Countries.countries.add(	new Country(	168	,	"	Sweden	"	,	10415811	,	407284	,	627438000000L	));
        Countries.countries.add(	new Country(	169	,	"	Switzerland	"	,	8697723	,	39516	,	812867000000L	));
        Countries.countries.add(	new Country(	170	,	"	Syria	"	,	18275704	,	183630	,	21445775364L	));
        Countries.countries.add(	new Country(	171	,	"	Tajikistan	"	,	9749625	,	138790	,	8746270636L	));
        Countries.countries.add(	new Country(	172	,	"	Tanzania	"	,	61498438	,	885800	,	67775101794L	));
        Countries.countries.add(	new Country(	173	,	"	Thailand	"	,	69950844	,	510890	,	505982000000L	));
        Countries.countries.add(	new Country(	174	,	"	Timor-Leste	"	,	1343875	,	14870	,	1959134744L	));
        Countries.countries.add(	new Country(	175	,	"	Togo	"	,	8478242	,	54390	,	8413200568L	));
        Countries.countries.add(	new Country(	176	,	"	Tonga	"	,	106759	,	720	,	488829964L	));
        Countries.countries.add(	new Country(	177	,	"	Trinidad and Tobago	"	,	1403374	,	5130	,	21391802311L	));
        Countries.countries.add(	new Country(	178	,	"	Tunisia	"	,	11935764	,	155360	,	46840042941L	));
        Countries.countries.add(	new Country(	179	,	"	Türkiye	"	,	85042736	,	769630	,	815272000000L	));
        Countries.countries.add(	new Country(	180	,	"	Turkmenistan	"	,	6117933	,	469930	,	45231428571L	));
        Countries.countries.add(	new Country(	181	,	"	Tuvalu	"	,	11925	,	30	,	63100962L	));
        Countries.countries.add(	new Country(	182	,	"	Uganda	"	,	47123533	,	200520	,	40434701517L	));
        Countries.countries.add(	new Country(	183	,	"	Ukraine	"	,	43814581	,	579400	,	200086000000L	));
        Countries.countries.add(	new Country(	184	,	"	United Arab Emirates	"	,	9991083	,	71020	,	358868765175L	));
        Countries.countries.add(	new Country(	185	,	"	Uruguay	"	,	3485152	,	175020	,	59319547636L	));
        Countries.countries.add(	new Country(	186	,	"	USA	"	,	331893745	,	9147420	,	22996100000000L	));
        Countries.countries.add(	new Country(	187	,	"	Uzbekistan	"	,	34915100	,	440650	,	69238903106L	));
        Countries.countries.add(	new Country(	188	,	"	Vanuatu	"	,	314464	,	12190	,	983469257L	));
        Countries.countries.add(	new Country(	189	,	"	Venezuela	"	,	28704947	,	882050	,	40L	));
        Countries.countries.add(	new Country(	190	,	"	Vietnam	"	,	98168829	,	313429	,	362638000000L	));
        Countries.countries.add(	new Country(	191	,	"	Yemen	"	,	30490639	,	527970	,	21061691630L	));
        Countries.countries.add(	new Country(	192	,	"	Zambia	"	,	18920657	,	743390	,	21203059080L	));
        Countries.countries.add(	new Country(	193	,	"	Zimbabwe	"	,	15092171	,	386850	,	26217726717L	));
    }


    private void stumb(JSONObject JSONObject) {
        JSONArray arr = (JSONArray) JSONObject.get("countries 2020");

        Iterator<JSONObject> iterator = arr.iterator();
        while (iterator.hasNext()) {
            JSONObject object = iterator.next();

            Countries.countries.add(new Country(
                    (int) object.get("id"),
                    (String) object.get("name"),
                    (long) object.get("population"),
                    (int) object.get("square"),
                    (long) object.get("udp")
            ));
/*
            Commands.commands.add(new Command(
                    (int) object.get("id"),
                    (String) object.get("command"),
                    (String) object.get("info")
            ));*/

        }
    }

}

# Homework-1

1. Java’nın platform bağımsızlığını nasıl sağladığını anlatınız.(5 PUAN)
2. Java neden çoklu kalıtımı desteklemez? Hangi diller bu duruma neden izin verir? (5 PUAN)
3. Build Tool nedir? Java ekosistemindeki toollar neler?
4. Collection framework içerisindeki
yapıları örnekleyip açıklayınız. (20 PUAN)
5. Bir müşterinin, sipariş oluşturup, faturalarını kaydedebildiği ve görüntüleyebildiği bir uygulama
yazın. Final, static, overload, override, constructor, kalıtım, polimorfizim, encapsulation, List, Set,
Map kavramlarını kullanılmalıdır. Sisteme eklemeler yapabilirsiniz. Main method üzerinde
çalışması yeterlidir. SOLID prensiplerine uygun olarak yazmaya çalışınız. Kod kalitesi
puanlanacaktır, isimlendirme kurallarına dikkat ediniz. Listeleme işlemleri stream kullanılarak
yapılmalı.(70 PUAN)
• Maven projesi oluşturun.
• Maven komutlarını çalıştırıp, çıktıyı ekleyin
• Tüm müşterileri listeleyin
• Yeni Müşteri oluşturabilen
• İçerisinde ‘C’ harfi olan müşterileri listeleyin
• Haziran ayında kayıt olan müşterilerin faturalarınının toplam tutarını listeleyin
• Sistemdeki tüm faturaları listeleyin
• Sistemdeki 1500TL üstündeki faturaları listeleyin
• Sistemdeki 1500TL üstündeki faturaları ortalamasını hesaplayın
• Sistemdeki 500TL altındaki faturalara sahip müşterilerin isimleri listeleyin
• Haziran ayını faturalarını ortalaması 750 altı olan firmalarının hangi sektörde olduğunu listeleyen
kodu yazın.

Bu dosya Patika.dev - LOGO Java & Spring Boot eğitimi dışında kullanılamaz.
Cem DIRMAN
***
### MAVEN KOMUTLARI

#### mvn clean: Projenin derlenmesi sırasında oluşan target klasörünün silinmesini sağlar.
<br>PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr> mvn clean 
<br>[INFO] Scanning for projects...
<br>[INFO]
<br>[INFO] -----------------------< org.example:Homework1 >------------------------
<br>[INFO] Building Homework1 1.0-SNAPSHOT                                         
<br>[INFO] --------------------------------[ jar ]---------------------------------
<br>[INFO]
<br>[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Homework1 ---
<br>[INFO] Deleting C:\Users\PC\Documents\GitHub\homework-1-caglasirr\target
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] BUILD SUCCESS
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] Total time:  0.881 s
<br>[INFO] Finished at: 2022-06-15T22:25:45+03:00
<br>[INFO] ------------------------------------------------------------------------<br>

#### mvn validate: Projenin target dosyasını siler ve daha sonra hatalı kısımları tarar.

[INFO] Scanning for projects...
<br>[INFO]
<br>[INFO] -----------------------< org.example:Homework1 >------------------------
<br>[INFO] Building Homework1 1.0-SNAPSHOT
<br>[INFO] --------------------------------[ jar ]---------------------------------
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] BUILD SUCCESS
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] Total time:  0.223 s
<br><INFO> Finished at: 2022-06-16T00:20:59+03:00 <br>

#### mvn compile: Projeyi clean ve validate edip derler.

[INFO] Scanning for projects...
<br>[INFO]
<br>[INFO] -----------------------< org.example:Homework1 >------------------------
<br>[INFO] Building Homework1 1.0-SNAPSHOT
<br>[INFO] --------------------------------[ jar ]---------------------------------
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] Copying 0 resource
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Homework1 ---
<br>[INFO] Changes detected - recompiling the module!
<br>[WARNING] File encoding has not been set, using platform encoding Cp1254, i.e. build is platform dependent!
<br>[INFO] Compiling 9 source files to C:\Users\PC\Documents\GitHub\homework-1-caglasirr\target\classes
<br>[WARNING] /C:/Users/PC/Documents/GitHub/homework-1-caglasirr/src/main/java/CollectionFramework/Main.java: Some input files use unchecked or unsafe operations.
<br>[WARNING] /C:/Users/PC/Documents/GitHub/homework-1-caglasirr/src/main/java/CollectionFramework/Main.java: Recompile with -Xlint:unchecked for details.
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] BUILD SUCCESS
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] Total time:  4.626 s
<br>[INFO] Finished at: 2022-06-16T00:23:16+03:00
<br>[INFO] ------------------------------------------------------------------------<br>
<br>PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr>

#### mvn test: Projeyi derler ve test sınıflarını çalıştırır.

PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr> mvn test
<br>[INFO] Scanning for projects...
<br>[INFO]
<br>[INFO] -----------------------< org.example:Homework1 >------------------------
<br>[INFO] Building Homework1 1.0-SNAPSHOT
<br>[INFO] --------------------------------[ jar ]---------------------------------
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] Copying 0 resource
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Homework1 ---
<br>[INFO] Nothing to compile - all classes are up to date
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] skip non existing resourceDirectory C:\Users\PC\Documents\GitHub\homework-1-caglasirr\src\test\resources
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Homework1 ---
<br>[INFO] Nothing to compile - all classes are up to date
<br>[INFO]
<br>[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Homework1 ---
<br>[INFO] No tests to run.
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] BUILD SUCCESS
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] Total time:  2.690 s
<br>[INFO] Finished at: 2022-06-16T00:25:40+03:00
<br>[INFO] ------------------------------------------------------------------------
<br>PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr> <br>

#### mvn package: Proje testlerini yapar ve eğer hata yoksa projedeki derlenmiş kodları paketlemesini sağlar.

PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr> mvn package
<br>[INFO] Scanning for projects...
<br>[INFO]
<br>[INFO] -----------------------< org.example:Homework1 >------------------------
<br>[INFO] Building Homework1 1.0-SNAPSHOT
<br>[INFO] --------------------------------[ jar ]---------------------------------
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] Copying 0 resource
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Homework1 ---
<br>[INFO] Changes detected - recompiling the module!
<br>[WARNING] File encoding has not been set, using platform encoding Cp1254, i.e. build is platform dependent!
<br>[INFO] Compiling 9 source files to C:\Users\PC\Documents\GitHub\homework-1-caglasirr\target\classes
<br>[WARNING] /C:/Users/PC/Documents/GitHub/homework-1-caglasirr/src/main/java/CollectionFramework/Main.java: Some input files use unchecked or unsafe operations.
<br>[WARNING] /C:/Users/PC/Documents/GitHub/homework-1-caglasirr/src/main/java/CollectionFramework/Main.java: Recompile with -Xlint:unchecked for details.
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] skip non existing resourceDirectory C:\Users\PC\Documents\GitHub\homework-1-caglasirr\src\test\resources
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Homework1 ---
<br>[INFO] Nothing to compile - all classes are up to date
<br>[INFO]
<br>[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Homework1 ---
<br>[INFO] No tests to run.
<br>[INFO]
<br>[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ Homework1 ---
<br>[INFO] Building jar: C:\Users\PC\Documents\GitHub\homework-1-caglasirr\target\Homework1-1.0-SNAPSHOT.jar
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] BUILD SUCCESS
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] Total time:  5.166 s
<br>[INFO] Finished at: 2022-06-16T00:46:20+03:00
<br>[INFO] ------------------------------------------------------------------------
<br>PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr> <br>

#### mvn verify: Projeyi paketler ve daha sonra bu paketlerin geçerliliğini kontrol eder.

[INFO] Scanning for projects...
<br>[INFO]
<br>[INFO] -----------------------< org.example:Homework1 >------------------------
<br>[INFO] Building Homework1 1.0-SNAPSHOT
<br>[INFO] --------------------------------[ jar ]---------------------------------
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] Copying 0 resource
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Homework1 ---
<br>INFO] Nothing to compile - all classes are up to date
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] skip non existing resourceDirectory C:\Users\PC\Documents\GitHub\homework-1-caglasirr\src\test\resources
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Homework1 ---
<br>[INFO] Nothing to compile - all classes are up to date
<br>[INFO]
<br>[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Homework1 ---
<br>[INFO] No tests to run.
<br>[INFO]
<br>[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ Homework1 ---
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] BUILD SUCCESS
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] Total time:  2.619 s
<br>[INFO] Finished at: 2022-06-16T00:49:09+03:00
<br>[INFO] ------------------------------------------------------------------------
PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr>

#### mvn install: Projeyi doğruladıktan sonra yerel depoya yükler.

<br>[INFO] Scanning for projects...
<br>[INFO]
<br>[INFO] -----------------------< org.example:Homework1 >------------------------
<br>[INFO] Building Homework1 1.0-SNAPSHOT
<br>[INFO] --------------------------------[ jar ]---------------------------------
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] Copying 0 resource
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Homework1 ---
<br>[INFO] Nothing to compile - all classes are up to date
<br>[INFO]
<br>[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Homework1 ---
<br>[WARNING] Using platform encoding (Cp1254 actually) to copy filtered resources, i.e. build is platform dependent!
<br>[INFO] skip non existing resourceDirectory C:\Users\PC\Documents\GitHub\homework-1-caglasirr\src\test\resources
<br>[INFO]
<br>[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Homework1 ---
<br>[INFO] Nothing to compile - all classes are up to date
<br>[INFO]
<br>[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Homework1 ---
<br>[INFO] No tests to run.
<br>[INFO]
<br>[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ Homework1 ---
<br>[INFO]
<br>[INFO] --- maven-install-plugin:2.4:install (default-install) @ Homework1 ---
<br>[INFO] Installing C:\Users\PC\Documents\GitHub\homework-1-caglasirr\target\Homework1-1.0-SNAPSHOT.jar to C:\Users\PC\.m2\repository\org\example\Homework1\1.0-SNAPS
<br>HOT\Homework1-1.0-SNAPSHOT.jar
<br>[INFO] Installing C:\Users\PC\Documents\GitHub\homework-1-caglasirr\pom.xml to C:\Users\PC\.m2\repository\org\example\Homework1\1.0-SNAPSHOT\Homework1-1.0-SNAPSHOT
.pom
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] BUILD SUCCESS
<br>[INFO] ------------------------------------------------------------------------
<br>[INFO] Total time:  2.596 s
<br>[INFO] Finished at: 2022-06-16T00:50:48+03:00
<br>[INFO] ------------------------------------------------------------------------
<br>PS C:\Users\PC\Documents\GitHub\homework-1-caglasirr><br>
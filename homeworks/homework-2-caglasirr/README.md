# homework-2

Java dünyasındaki framework’ler ve çözdükleri problemler nedir?(Spring MVC, JSP,
Struct, Vaadin). Örnekler ile açıklayın. (20 Puan)

**Spring:** Java ile proje yaparken database connect pool, database driver, üçüncü parti jar dosyaları kütüphanesi, ssl protokolü ve karakter encoding gibi konfigürasyonlara ihtiyacımız olur. Bu konfigürasyonların hepsini kendimiz
yapmamız gerekir ve bu zaman alıcı bir iştir. Spring neredeyse bu konfigürasyonların hepsini bizim için yapar. Böylece asıl yazmamız gereken koda geçebilir ve işin mantığına odaklanabiliriz. Tabii ki Spring kullanırken de
bazı konfigürasyonları yapmamız gerekir ama bu çok minimal düzeydedir.

Hibernate: Hibernate bir ORM aracıdır. ORM araçları Java'daki nesnelerle veritabanındaki tablolar/objeler arasında bağlantı kurmamızı/maplememizi sağlar. JDBC API yerine Hibernate kullanmak bizi tekrarlı kod yazmaktan kurtarır.

JavaServer Faces [JSF]: Oracle tarafından Java Enterprise Edition 7'nin bir parçası olarak geliştirilmiştir. Komponent bazlı bir MVC frameworküdür. Server tabanlı uygulamalar için yeniden kullanılabilir
UI komponentlerine sahiptir. JSF'nin çözüm getirdiği problem, developerın html, css, javascript gibi önyüzde kullanılan teknolojileri fazla kullanmadan, sadece sürükle-bırak yöntemi ile ui komponentleri ile
çalışmasını sağlarlar. Bu sayede developer önyüz katmanındansa sunum katmanına odaklanabilir.

Struts: Web geliştirme için kullanılan açık kaynak kodlu bir frameworktür. MVC modeline dayanır ve JSP Api'sini extend eder. View yani sunum katmanının normalde bir business/logic'e sahip olmaması gerektiğinden, kompleks
uygulamalar için kafa karıştırıcı olabilir.

Google web toolkit [GWT]: Web uygulamaları geliştirmek için Google tarafından geliştirilmiştir ve açık kaynak kodludur. Sadece Java yazarak geliştirme yapabiliriz ve Java kodunu Javascript koduna dönüştürür. Debug, refactor ve unit
test işlemlerini UI katmanında yapmamızı sağlar. JUnit ve Maven ile kolayca entegre olabilir.

Vaadin: Html ve javascript gibi client-side teknolojilerini kullanmadan, sadece Java kodu yazarak web uygulaması geliştirilmesini sağlar.

Grails, Blade, Dropwizard, Play de çok kullanılan Java frameworkleri arasındadır.

• Katmanlı mimari nedir? (10 Puan)

Katmanlı mimari projelerimizi belirli bir standart ve düzene göre geliştirmemizi sağlayan, kodun okunabilirliğini arttıran, projelerimizin daha derli toplu olmasını sağlayan ve
hata yönetimini daha kolay hale getiren bir yapıdır. Yazılımlarda veriye nasıl erişileceği, üzerinde nasıl işlemler yapılacağı ve bu işlemlerin kullanıcıya nasıl gösterileceği gibi
işlemleri katmanlı mimari ile çok iyi bir şekilde yönetebiliyoruz. Katmanlı mimaride Sunum Katmanı (Presentation Layer), İş Katmanı (Business Layer), Veri Katmanı (Data Access Layer) gibi katmanlar
vardır. Veri katmanında -dao ya da repository olarak karşımıza çıkar- sadece CRUD operasyonları gerçekleştirilir. CRUD operasyonları veri ekleme, silme, güncelleme ve okuma gibi işlemlerdir.
Bu katmanda aynı zamanda veritabanı bağlantıları gerçekleştirilir. Business katmanında sadece iş kodları yani kurallar yazılır. Business katmanı veri katmanını kullanır. Örneğin Personel verisini verikatmanında çekeriz
ama bu Personel ile ne yapılacağının -maaş ödemesi, izin günleri hesaplama vs- kodları Business katmanında yazılır. Bunun avantajlı tarafı şudur, örneğin veritabanımızı değiştirmek istedik. Business katmanı bunu
hiç bilmeden, sadece veri katmanında değişiklik yaparak bunu sağlayabiliriz. Bu şekilde bağımlılığı azaltmış oluruz. Sunum katmanı ise arayüz katmanıdır. Yani kullanıcının gördüğü ve onunla etkileşime geçen katman
bu kkatmandır. Bu katmanda kulllanıcıdan alınan veriler Business ve Veri katmanına göndeirlir.

• Garbage collector nedir, nasıl çalışır? Diğer C++ ile karşılaştırın. (10 Puan)

Java, C# gibi bazı nesne yönelimli programlama dillerinde Garbage Collector mekanizması vardır. Kullanılmayan/referans edilmeyen nesnelere bellekte ayrılan yer boşaltılır.
RunTime’da oluşturulan nesneler, uygulama tarafından ihtiyaç duyulmadığı zamanlarda ya da programda oluşturulan nesnenin işi bittiğinde, heap bellekten temizlenir. Belleği boşaltma görevi Garbage Collector'e aittir.
Ancak bazı orta seviyeli programlama dillerinde işi biten nesneyi bellekten silmek, programcının görevidir. Örn : C++’da bir nesne Destructor (yıkıcı veya yok edici) metodu ile yok edilir.

• Spring frameworkünün kullandığı design patternlar neler? (10 Puan)

Spring frameworkünde kullanılan design patternler Singleton, Factory Method pattern, Proxy pattern, Template patterndir. Buradaki ilk iki design patternler detaylı olarak 5. soruda açıklanmıştır.
Proxy Pattern: Güvenlik ve maliyet gibi nedenlerden dolayı nesneye olan erişimi kontrol etmek gerekebilir. Ama bu nedenleri nesne üzerinde gidermeye çalışmak nesnenin birlikteliğini düşürebilir.
Bu kısıtları istemciden de yalıtmak gerekir. İstemci kısıtlardan haberdar olmamalı ve sanki normal nesne ile çalışıyor gibi devam etmelidir. Çözüm, istemci ile erişimi kontrol edilecek nesne arasına
bir ara geçiş (surrogate) nesnesi (ya da sahte/mış gibi yapan (placeholder) nesne) koymaktır. Bu nesne Proxy'dir. Bu ara, geçiş nesnesinin arayüzü, saklanan nesne ile aynı olursa,
istemci bu durumdan haberdar olamaz, asıl nesne ile aradaki nesneyi ayırt edemez.

• Creational Patterns neler? Önceki ödevde oluşturulan nesnelerinizi factory Design
patterni ile oluşacak şekilde düzenleyin. (25 Puan)

Singleton, Factory Method, Abstract Factory, Builder ve Prototype olmak üzere beş adet Creational Pattern vardır. Builder ve Prototype nesnenin nasıl, Factory Method ve Abstract Factory nesnenin nerede yaratılması gerektiğini
inceler.

Singleton: Bir sınıftan sadece bir nesne üretilmesi gerektiğini söyler. Böylece herkes istediği zaman bu sınıfın nesnesini oluşturamaz ve var olan tek nesneyi kullanır. Yapılması şu şekilde olur: Sınıfın içinde
kendi tipinden private ve static bir nesne oluşturulur. Constructor private yapılır. public ve static olarak bir getInstance methodu yazılır ve nesne dışarıdan erişime açılır.

Factory Method: Factory Method, bir üst sınıfta nesneler oluşturmak için bir interface sağlayan, ancak alt sınıfların oluşturulacak nesnelerin türünü değiştirmesine izin veren bir tasarım desenidir.

Abstract Factory: Abstract Factory, Factory Method'un özel bir halidir. Abstract Factory tek nesne yerine, nesne ailesi oluşturmak üzere kullanılan bir kalıptır. Abstract Factory bir sınıftır, Factory Method ise bir methoddur.
Factory Method tek bir nesnenin, Abstract Factory birden fazla nesnenin yaratılmasını soyutlar. Abstract Factory birden fazla Factory Method'a sahiptir.

Builder: Builder karmaşık nesnelerin adım adım oluşturulduğu yaratımsal bir tasarım desenidir. Bu desen aynı kurucu kod ile farklı tür ve gösterimdeki nesneleri oluşturmanıza olanak sağlar.
Türkçe karlılığı kurucu, inşaatçı vb. tanımlardır.Builder deseni nesnenin kurucu kodunu kendine has bir sınıfa dönüştürerek, builder olarak adlandırılan bağımsız nesneleri taşımanızı önerir.

Prototype: Prototype bir objeyi, kodunuz onun sınıflarına bağımlı hale gelmeden kopyalamayı sağlayan bir tasarım desenidir. Klonlanacak sınıftan bir nesne oluşturur ve eski nesnenin tüm alan
değerlerini yenisine taşırsınız. Özel alanları bile kopyalayabilirsiniz çünkü çoğu programlama dili, nesnelerin aynı sınıfa ait diğer nesnelerin özel alanlarına erişmesine izin verir.

• Singleton ve AbstractFactory patterlerini implemente eden kodu yazın.(25 Puan)

Custpomer, Order ve Product servisleri Singleton Pattern'i implemente edecek şekilde yazılmıştır.
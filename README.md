## README.md

### MineSweeper Game

This is a text-based implementation of the MineSweeper game in Java. The game is played on a two-dimensional grid and designed within the MineSweeper class. The user can customize the size of the grid by specifying the number of rows and columns. The game follows the rules of MineSweeper and provides options for the user to select cells and reveal the presence of mines. The objective of the game is to uncover all cells without stepping on a mine.

#### Rules

- The game is played in a text-based interface.
- The game is implemented using two-dimensional arrays and encapsulated within the MineSweeper class.
- The size of the grid (number of rows and columns) is determined by the user.
- The number of mines is set to one-fourth of the total number of cells (rows * columns). For example, if the grid is 4x3, the total number of cells is 12, and there should be 3 mines randomly placed.
- The game prompts the user to select a cell by specifying the row and column values.
- The program checks if the selected cell is within the boundaries of the grid. If not, it requests a valid cell from the user.
- If the selected cell contains a mine, the game ends, and the user loses.
- If the selected cell does not contain a mine, the program calculates the number of adjacent mines and displays it in the cell. If there are no adjacent mines, the cell is marked with a "0" value.
- The user wins the game if they successfully select all cells without stepping on a mine.

#### Türkçe Açıklama

Java dilinde Mayın Tarlası oyununun metin tabanlı bir uygulamasıdır. Oyun, iki boyutlu bir ızgarada oynanır ve MineSweeper sınıfı içinde tasarlanmıştır. Kullanıcı, ızgara boyutunu belirleyerek satır ve sütun sayısını özelleştirebilir. Oyun, Mayın Tarlası kurallarına uygun olarak çalışır ve kullanıcıya hücre seçme ve mayın varlığını açıklama seçenekleri sunar. Oyunun amacı, tüm hücreleri ortaya çıkarmak ve hiçbir mayına basmadan oyunu tamamlamaktır.

#### Kurallar

- Oyun metin tabanlı bir arayüzde oynanır.
- Oyun, iki boyutlu diziler kullanılarak ve MineSweeper sınıfı içine kapsülleyerek uygulanmıştır.
- Izgara boyutu (satır ve sütun sayısı) kullanıcı tarafından belirlenir.
- Mayın sayısı, toplam hücre sayısının (satır * sütun) çeyreği olarak belirlenir. Örneğin, ızgara 4x3 ise toplam hücre sayısı 12 olacak ve rastgele olarak 3 mayın yerleştirilecektir.
- Oyun, kullanıcıdan bir hücre seçmesini isteyerek satır ve sütun değerlerini belirtmesini bekler.
- Program, seçilen hücrenin ızgara sınırları içinde olup olmadığını kontrol eder. Eğer sınırlar içinde değilse, geçerli bir hücre istenir.
- Seçilen hücre bir mayın içeriyorsa, oyun biter ve kullanıcı kaybeder.
- Seçilen hücre bir mayın içermiyorsa, program komşu mayınların sayısını hesaplar ve hücrede gösterir. Eğer komşu mayın yoksa, hücre "0" değeriyle işaretlenir.
- Kullanıcı, hiçbir mayına basmadan tüm hücreleri seçerse oyunu kazanır.

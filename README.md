# JVM指针探索(因md不太方便贴图，所以如下都没有给出图，大家可以根据相关工具查看进程所占用的内存大小)
## 1、你的服务器内存>=32G
java -Xms32g -Xmx32g -jar jvm-compress-pointer.jar 1000
可以看到，32g堆内存下，包含1000万个Integer元素的LinkedList共占用内存814.9MB。

## 2、设置31g
java -Xms31g -Xmx31g -jar jvm-compress-pointer.jar 1000
内存只占用了495.5MB，整整下降了232.3MB！下降幅度达39.2%.

## 3、通过探索发现
32g临界点，并不是一个确切的值。只能说在接近32g范围内有可能会导致指针压缩失效。
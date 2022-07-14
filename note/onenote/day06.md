1. 数组：

   - 复制：

     ~~~java
     System.arraycopy(a,1,b,0,4);
     //a:源数组
     //1:源数组的起始下标
     //b:目标数组
     //0:目标数组的起始下标
     //4:要复制的元素个数
     int[] b = Arrays.copyOf(a,6);
     //a:源数组
     //b:目标数组
     //6:目标数组的长度
     //----若目标数组的长度>源数组长度，则在末尾补默认值
     //----若目标数组的长度<源数组长度，则将末尾的截掉
     a = Arrays.copyOf(a,a.length+1); //扩容
     ~~~

   - 排序：

     ```java
     Arrays.sort(arr); //升序排列
     Arrays.toString(arr); 
     ```

2. 
























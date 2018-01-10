package k.event_2;
interface Notify {
	// 第一个参数时与方法返回值类型一致，后面的参数类型、顺序与方法参数的类型与返回值一致
    void onreturn(Person msg, String name,int classId);
}
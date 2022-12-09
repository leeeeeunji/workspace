
public class OuterComposingInnerClass {
	//member field;
	public int outer_member_field;
	
	//member method;
	public void outer_member_method() {
		System.out.println("OuterComposingInnerClass.outer_member_method()");
	}
	
	/********************Outer Class에서 Inner Class 사용**********************/
	public void outer_inner_class_use( ) {
		/*
		 * local변수
		 */
		int local_variable = 100;
		/*****************************member inner class[CASE1]*****************************
		ParentFirstConcreteClass childFirstConcreteClass = new ChildFirstConcreteClass();
		childFirstConcreteClass.local_inner_outer_access();
		***********************************************************************************/
		/*ParentFirstConcreteClass childFirstConcreateClass = new ParentFirstConcreteClass() {
			@Override
				public void local_inner_outer_access() {
					System.out.println("ParentFirstConcreteClass를 상속받는 ChildFirstConcreteClass에서 "
							+ "재정의한 local_inner_outer_access");
				}
			};
			childFirstConcreteClass.local_inner_outer_access();
			*/
		
		/*
		<< 특정클래스의 메소드를 재정의 해야할 때 >>
			1. local위치에서 이름이 존재하지 않는 클래스 정의
			2. local위치에서 객체 생성
		 */
		
		
		/********************anonymous local inner class[CASE1]**********************/
		ParentFirstConcreteClass childConcreteClass = new ParentFirstConcreteClass() {
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentFirstConcreteClass를 상속받는 이름없는 로컬 내부클래스에서 "
						+ "재정의한 local_inner_outer_access");
			}
			
		};
		childConcreteClass.local_inner_outer_access();
		
		
		
		ParentSecondAbstractClass childabstractClass = new ParentSecondAbstractClass() {
				@Override
				public void local_inner_outer_access() {
					System.out.println("ParentSecondAbstractClass를 이름없는 클래스에서 "
							+ "재정의한 local_inner_outer_access");
				}
			};
		childabstractClass.local_inner_outer_access();
		
		
		
		ParentThirdInterface childThirdInterface = new ParentThirdInterface() {
			
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentThirdInterface를 상속받은(구현한) 이름없는 클래스에서 "
						+ "재정의한 local_inner_outer_access");
			}
		};
		childThirdInterface.local_inner_outer_access();
		
		
		
		Object oc = new Object() {
			@Override
			public String toString() {
				return "난 재정의된 toString";
			}
		};
		
		
		
	}//end method;
	
	
	
	/**********ParentFirstConcreteClss를 상속받고 
	 Public void local_inner_outer_access()메소드를 재정의하는 Inner클래스*********/
	
	/*****************************member inner class[CASE2]*****************************/
	//public class ChildFirstConcreteClass extends ParentFirstConcreteClass
	
	public static void main(String[] args) {
		OuterComposingInnerClass outerComposintInnerClass = new OuterComposingInnerClass();
		outerComposintInnerClass.outer_inner_class_use();
	}
	
}

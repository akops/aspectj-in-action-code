/*
Copyright 2009 Ramnivas Laddad

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 
    http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/

package ajia.tracking;

import static org.junit.Assert.*;

import org.junit.Test;

import ajia.banking.domain.ExampleEntityThatImplementsGetSetId;

public class AccountTrackingTest {
	@Test
	public void mixin() {
		ExampleEntityThatImplementsGetSetId entity = new ExampleEntityThatImplementsGetSetId();
		// Will fail if mixin didn't take place
		Identifiable identifiableEntity = (Identifiable)entity;
		identifiableEntity.setId(10L);
		assertEquals(new Long(10L), identifiableEntity.getId());
	}
}

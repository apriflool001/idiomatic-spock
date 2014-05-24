package idiomaticspock.tck

import groovy.transform.CompileStatic
import groovy.transform.Immutable

@Immutable
@CompileStatic
class Cocktail {
  String name
  String baseSpirit
}

import groovy.transform.Field

import java.util.function.Predicate

/**
 * Created by noam (malyhinam@gmail.com)
 */

@Field
def heroes = [hero('Ironman', 'Marvel'), hero('Batman', 'DC'), hero('Harley Quinn', 'DC'), hero('Black Widow', 'Marvel')]

Map hero(name, team) {
    [name: name, team: team]
}

List<String> chooseTeam(Predicate<String>... predicates) {
    heroes.findAll({ def that = it; predicates.every({ it.test(that) }) })
}

println chooseTeam({ it.team == 'DC' })

/**
 * 1) MissingMethodException
 * 2) ClassCastException
 * 3) [[name:Black Widow, team:Marvel], [name:Ironman, team:Marvel]]
 * 4) [[name:Batman, team:DC], [name:Harley Quinn, team:DC]]
 */
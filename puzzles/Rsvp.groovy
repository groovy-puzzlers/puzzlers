/**
 * RSVP
 *
 * @author Noam Y. Tenne
 */

class Invite {
    int attending = 1
}

def invite = new Invite()
def attendees = (invite.attending) +1
println attendees